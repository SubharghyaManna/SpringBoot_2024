package com.springproject.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.dto.CustomUser;
import com.springproject.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

	public List<CustomUser> findByFirstName(String name);

	public List<User> findByFirstNameAndLastName(String fName, String lName);

	public List<User> findByFirstNameOrLastName(String fName, String lName);

	public List<User> findByAgeBetween(int startAge, int endAge);

	public List<User> findByAgeLessThan(int minAge);

	public List<User> findByAgeLessThanEqual(int minAge);

	public List<User> findByEmailLike(String email);

	public List<User> findByFirstNameOrderByLastNameDesc(String fName);

	public List<User> findByFirstNameNot(String fName);

	public List<User> findByFirstNameNull();

	public List<User> findByDateOfBirthIsNotNull();

	public List<User> findByActiveTrue();

	public List<User> findByActiveFalse();

	@Query("select distinct(u.firstName) from User u")
//	@Query(value = "select distinct first_name from user", nativeQuery = true)
	public Iterable<String> getUniqueFirstName();

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM user WHERE first_name=?", nativeQuery = true)
	public int m1(String name);

	@Query("SELECT u.dateOfBirth FROM User u WHERE u.firstName='charlie'")
	public List<LocalDate> m2();

	@Query("SELECT u.dateOfBirth FROM User u WHERE u.firstName=:name")
	public List<LocalDate> m3(String name);

	@Query("SELECT u.age FROM User u WHERE u.email LIKE %:emailPart%")
	public List<Integer> m4(@Param("emailPart") String emailPart);

	@Query("SELECT u.firstName, u.lastName FROM User u WHERE u.email LIKE %:emailPart%")
	public List<Object[]> m5(@Param("emailPart") String emailPart);

}
