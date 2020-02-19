package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @Column(name="name")
    String name;

    @Column(name="email")
    String email;

    @Column(name="password")
    String UserPassword;

    @Column(name="address")
    String address;


    public User(Long id, String name, String email, String UserPassword, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.UserPassword = UserPassword;
        this.address = address;
    }
    public User()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return UserPassword;
    }

    public void setPassword(String password) {
        this.UserPassword = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
