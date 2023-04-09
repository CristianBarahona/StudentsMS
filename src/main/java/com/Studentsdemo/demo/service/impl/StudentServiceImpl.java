package com.Studentsdemo.demo.service.impl;

import com.Studentsdemo.demo.entity.Student;
import com.Studentsdemo.demo.repository.StudentRepository;
import com.Studentsdemo.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

//When creating a service class we need to add a service  annotation

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents(){


        return studentRepository.findAll();
    }
}
