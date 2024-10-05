package com.springproject.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( // define a (bridge) new table for join
		name = "student_course", // name of the join table
		joinColumns = @JoinColumn(name = "student_id"), // Foreign key to student table
		inverseJoinColumns = @JoinColumn(name = "course_id") // Foreign key to course table
	)
	private Set<Course> courses;

}
