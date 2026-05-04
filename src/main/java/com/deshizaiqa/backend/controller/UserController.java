package com.deshizaiqa.backend.controller;

import com.deshizaiqa.backend.entity.User;
import com.deshizaiqa.backend.repository.UserRepository;
import com.deshizaiqa.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user) {

        User existingUser =  userRepository.findByPhoneNumber(user.getPhoneNumber());

        if (existingUser != null) {
            if (user.getUserName() != null) {
                existingUser.setUserName(user.getUserName());
                existingUser.setRole("CUSTOMER");
                userRepository.save(existingUser);
            }
            return ResponseEntity.ok(existingUser);
        }else{
            user.setRole("CUSTOMER");
            return ResponseEntity.ok(userService.save(user));
        }
    }

    @GetMapping
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
