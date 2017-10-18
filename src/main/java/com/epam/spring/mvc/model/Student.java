package com.epam.spring.mvc.model;

import java.util.LinkedHashMap;

/**
 * @author Andrey_Chadov on 10/17/2017.
 */
public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favoriteLanguage;

    private LinkedHashMap<String, String> favoriteLanguageOptions;

    public Student() {
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("Ruby", "Ruby");

    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
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
