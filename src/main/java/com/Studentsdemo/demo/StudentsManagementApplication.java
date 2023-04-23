package com.Studentsdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Studentsdemo.demo.entity.Student;
import com.Studentsdemo.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	}

}
