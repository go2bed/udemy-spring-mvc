package com.epam.spring.mvc.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Andrey_Chadov on 10/23/2017.
 */
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    public Customer() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
