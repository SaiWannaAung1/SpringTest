package com.example.demo.dto;

import com.example.demo.entity.User;

public class UserDto {

      Long id;

      String name;

      String email;

       String UserPassword;

      String address;
    public UserDto(User user)
    {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.UserPassword = user.getPassword();
        this.address = user.getAddress();


    }

    public UserDto(Long id, String name, String email, String UserPassword, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.UserPassword = UserPassword;
        this.address = address;
    }

    public UserDto()
    {

    }
    public User getEntity()
    {
        User user = new User();
        user.setId(this.id);
        user.setEmail(this.email);
        user.setName(this.name);
        user.setPassword(this.UserPassword);
        user.setAddress(this.address);
        return user;
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

    public void setPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
