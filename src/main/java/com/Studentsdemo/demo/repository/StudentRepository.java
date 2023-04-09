package com.Studentsdemo.demo.repository;

import com.Studentsdemo.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository has 2 parameters Type of entity and type of primary key


public interface StudentRepository extends JpaRepository<Student, Long> {
}
