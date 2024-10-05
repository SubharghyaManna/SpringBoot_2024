package com.springproject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
