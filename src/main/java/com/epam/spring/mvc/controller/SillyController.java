package com.epam.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Andrey_Chadov on 10/17/2017.
 */
@Controller
@RequestMapping("/funny")
public class SillyController {

    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "silly";
    }

    @RequestMapping("/processForm")
    public String process(HttpServletRequest request, Model model) {
        return "helloworld";
    }


}
