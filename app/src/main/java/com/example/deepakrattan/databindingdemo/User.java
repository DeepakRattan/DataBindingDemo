package com.example.deepakrattan.databindingdemo;
//Step 2. we want to display user information from a User POJO class
public class User {
    private String name, email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
