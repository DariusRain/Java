package com.coderain.springrestapibasic.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User("John Smith", "johnsmith@gmail.com", 21, 1L)
        );
    }

}
