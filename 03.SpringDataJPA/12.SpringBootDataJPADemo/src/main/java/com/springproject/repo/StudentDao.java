package com.springproject.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

	public List<Student> findByName(String name);

}
