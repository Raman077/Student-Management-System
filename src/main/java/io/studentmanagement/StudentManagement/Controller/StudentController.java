package io.studentmanagement.StudentManagement.Controller;

import io.studentmanagement.StudentManagement.Student;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/addStudent")
    public String sendForm(Student student) {
        return "addStudent";
    }

    @PostMapping("/addStudent")
    public String processForm(Student student){
        return "showMessage";
    }


}
