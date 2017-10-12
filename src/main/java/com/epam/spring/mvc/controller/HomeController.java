package com.epam.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

/**
 * @author Andrey_Chadov on 10/10/2017.
 */
@Controller
public class HomeController {


    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        model.addAttribute("message", "Spring MVC XML Config Example");
        return "main-menu";
    }



}
