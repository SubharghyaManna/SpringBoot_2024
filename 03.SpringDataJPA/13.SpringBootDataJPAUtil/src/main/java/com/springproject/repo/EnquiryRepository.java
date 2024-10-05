package com.springproject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.comp.EnqPK;
import com.springproject.entity.Enquiry;

@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry, EnqPK> {

}
