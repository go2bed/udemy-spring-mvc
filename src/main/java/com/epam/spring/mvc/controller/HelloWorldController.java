package com.epam.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Andrey_Chadov on 10/12/2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping(value = "/processForm")
    public String processForm(@ModelAttribute("name") String name, ModelMap model) {
        model.addAttribute("name", name);
        return "helloworld";
    }
}
