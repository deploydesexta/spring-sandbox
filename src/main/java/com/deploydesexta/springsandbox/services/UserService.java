package com.deploydesexta.springsandbox.services;

import com.deploydesexta.springsandbox.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void greetings() {
        System.out.println("HELLO WORLD");
    }
}
