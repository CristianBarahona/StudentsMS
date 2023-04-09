package com.Studentsdemo.demo.controller;

import com.Studentsdemo.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    ///handler method to handle student request and return model and view
    //The view will be displayed in our html file so that we can view  it on the web browser
    @GetMapping("/student")
    public String listStudents(Model model){
    model.addAttribute("students",studentService.getAllStudents());
            return "students";
    }

}
