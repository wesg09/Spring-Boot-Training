package com.springboot.LearnJPACourses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LearnJPACourses.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
