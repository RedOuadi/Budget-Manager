package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUser;
    private String Username;

    // Getters and setters
    public int getUserId() {
        return IdUser;
    }

    public void setUserId(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getName() {
        return Username;
    }

    public void setName(String Username) {
        this.Username = Username;
    }
}