package com.deshizaiqa.backend.service;

import com.deshizaiqa.backend.entity.User;
import com.deshizaiqa.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        if (user.getActive() == null) {
            user.setActive(true);
        }
        return userRepository.save(user);
    }



}
