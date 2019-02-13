package com.alex.spring;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteCountry;
    private String[] operatingSystems;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    private Map<String, String> countryOptions;

    public String getFavoriteCountry() {
        return favoriteCountry;
    }

    public void setFavoriteCountry(String favoriteCountry) {
        this.favoriteCountry = favoriteCountry;
    }

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
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
}
