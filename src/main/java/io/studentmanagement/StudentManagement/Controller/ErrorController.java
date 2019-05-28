package io.studentmanagement.StudentManagement.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("/")
    public String home(){
        return "Hello Boy Ji";
    }
}
