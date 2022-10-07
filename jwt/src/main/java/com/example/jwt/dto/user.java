package com.example.jwt.dto;

public class user {

    private String User;

    private String Password;

    private String Token;

    public user(String user, String password, String token) {
        User = user;
        Password = password;
        Token = token;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
