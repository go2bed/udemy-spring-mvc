package com.epam.spring.mvc.controller;

import com.epam.spring.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andrey_Chadov on 10/17/2017.
 */
@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //create a student object
        Student theStudent = new Student();


        //add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent);

        return "student-confirmation";
    }
}
