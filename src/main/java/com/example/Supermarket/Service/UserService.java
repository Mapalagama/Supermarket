package com.example.Supermarket.Service;

import com.example.Supermarket.Entity.User;
import com.example.Supermarket.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();



    public User createUser(User user) {

        user.setRole("USER");
        String encodedPassword = passwordEncoder.encode((user.getPassword()));
        user.setPassword(encodedPassword);
        return userRepo.save(user);
    }

    public User get(Integer id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "user Not Found");
        }
        return user.get();
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public void delete(Integer id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found");
        }
    }
}
