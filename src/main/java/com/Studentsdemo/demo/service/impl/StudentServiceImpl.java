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
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        
        studentRepository.deleteById(id);
    }

    
}
