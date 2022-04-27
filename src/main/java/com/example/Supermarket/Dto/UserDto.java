package com.example.Supermarket.Dto;

import com.example.Supermarket.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private Integer id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String role;

    //User--->UserDto
    public static UserDto createUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirst_name(user.getFirst_name());
        userDto.setLast_name(user.getLast_name());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        return userDto;
    }
    //UserList----->UserDtoList
    public static List<UserDto> createUserDtos(List<User> userList) {
        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : userList) {
            UserDto userDto = UserDto.createUserDto(user);
            userDtoList.add(userDto);
        }
        return userDtoList;
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

    public UserDto() {
    }

    public UserDto(Integer id) {
        this.id = id;
    }
}
