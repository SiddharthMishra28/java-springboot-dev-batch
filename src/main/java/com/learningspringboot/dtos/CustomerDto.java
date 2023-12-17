package com.learningspringboot.dtos;

import com.learningspringboot.domain.Address;

import java.util.Date;

public class CustomerDto {
    private String Id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;

    // CONSTRUCTORS, GETTERS AND SETTERS

    public CustomerDto() {
    }

    public CustomerDto(String id, String firstName, String lastName, String email, Date dob) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
