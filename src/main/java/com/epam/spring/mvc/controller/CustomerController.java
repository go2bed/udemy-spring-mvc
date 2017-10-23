package com.epam.spring.mvc.controller;

import com.epam.spring.mvc.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author Andrey_Chadov on 10/23/2017.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    // add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        Customer customer = new Customer();

        //add customer object to the model
        theModel.addAttribute("customer", customer);

        return "customer-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult theBindingResult) {
        System.out.println("Last name: |" + theCustomer.getLastName() + "|");

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
