package com.example.instagramclone;

public class User {

    private String username,email,password,phone;

    public User(String phone) {
        this.phone = phone;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
