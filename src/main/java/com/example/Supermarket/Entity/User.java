package com.example.Supermarket.Entity;

import com.example.Supermarket.Dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String role;

    //UserDto------->User
    public static User createUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        return user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }
}
