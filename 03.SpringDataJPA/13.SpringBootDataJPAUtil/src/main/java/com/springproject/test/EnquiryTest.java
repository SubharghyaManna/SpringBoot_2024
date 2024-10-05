package com.springproject.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.entity.Enquiry;
import com.springproject.repo.EnquiryRepository;

@Component
public class EnquiryTest {

	@Autowired
	EnquiryRepository repository;

	public void test() {

		Enquiry enquiry1 = new Enquiry();
		enquiry1.setEnqName("JS Course Duration");
		enquiry1.setEnqStatus(true);

		Enquiry enquiry2 = new Enquiry();
		enquiry2.setEnqName("Node Course Price");
		enquiry2.setEnqStatus(false);

		Iterable<Enquiry> enquiry = repository.saveAll(List.of(enquiry1, enquiry2));
//
//		enquiry.forEach(System.out::println);

	}

}
