package com.springboot.LearnJPACourses.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "laptop")
@Data
public class Laptop {
	@Id
	private long id;
	private String modelNum;
	private String brand;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;

}
