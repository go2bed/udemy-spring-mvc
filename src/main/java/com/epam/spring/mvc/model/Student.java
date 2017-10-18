package com.epam.spring.mvc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Andrey_Chadov on 10/17/2017.
 */
public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private Set<String> favoriteLanguage;

    public Student() {
        favoriteLanguage = new HashSet<>();
        favoriteLanguage.add("Java");
        favoriteLanguage.add("Python");
        favoriteLanguage.add("Ruby");
        favoriteLanguage.add("C#");

    }

    public Set<String> getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(Set<String> favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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


    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", country='"
                + country + '\'' + '}';
    }
}
