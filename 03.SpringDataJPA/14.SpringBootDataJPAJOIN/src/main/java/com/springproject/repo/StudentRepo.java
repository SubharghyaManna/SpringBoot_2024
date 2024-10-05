package com.springproject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
