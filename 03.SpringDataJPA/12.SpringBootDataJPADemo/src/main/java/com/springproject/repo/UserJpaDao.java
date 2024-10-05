package com.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.entity.User;

public interface UserJpaDao extends JpaRepository<User, Long> {

}
