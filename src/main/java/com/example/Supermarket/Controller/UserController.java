package com.example.Supermarket.Controller;

import com.example.Supermarket.Dto.UserDto;
import com.example.Supermarket.Entity.User;
import com.example.Supermarket.Service.UserService;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public UserDto createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        UserDto userDto = UserDto.createUserDto(user);
        return userDto;
    }

}
