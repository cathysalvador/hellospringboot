package com.example.login.service;

import com.example.login.domain.User;

public interface UserService {

    public User findByEmail (String email);

    public User findByUsername (String username);

}
