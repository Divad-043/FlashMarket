package com.example.flashmarket.models;

public class User {
    private String name;
    private String lastName;
    private String sexe;
    private String password;
    private String phone;
    private String email;
    private String location;

    public User() {}

    public User(String name, String lastName, String sexe, String password, String phone, String email, String location) {
        this.name = name;
        this.lastName = lastName;
        this.sexe = sexe;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
