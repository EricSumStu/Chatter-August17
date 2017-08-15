package com.example.ezcolth.ericssonproject;

/**
 * Created by ezcolth on 09/08/2017.
 */

public class ObjectUserProfile
{
    private String fullName;
    private String email;
    private String description;
    private String password;

    public ObjectUserProfile(String fullName, String email, String description, String password) {
        this.fullName = fullName;
        this.email = email;
        this.description = description;
        this.password = password;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
