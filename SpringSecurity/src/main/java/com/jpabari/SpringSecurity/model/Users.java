package com.jpabari.SpringSecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    private int id;

    private String username;

    private String password;

    private String role;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }


    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

}
