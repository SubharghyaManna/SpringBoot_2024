package com.springproject.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springproject.entity.User;

public interface UserSortingDao extends PagingAndSortingRepository<User, Long> {

	Iterable<User> findAllByAge(int age, Sort sort);

	Page<User> findAllByAge(int age, Pageable pageable);

}
