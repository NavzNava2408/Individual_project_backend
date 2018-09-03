package com.example.individualapp.name.Model;


import org.springframework.data.annotation.Id;

public class Account {

    @Id
    private String id;
    private String firstname;
    private String surname;
    private String email;
    private String notes;

    private Account(){};

    public Account(String firstname, String surname, String email, String notes){
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.notes = notes;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }




    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
