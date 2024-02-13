package com.springboot.LearnJPACourses.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String about;

	@OneToOne(mappedBy = "student")
	private Laptop laptop;
}
