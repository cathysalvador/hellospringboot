package com.example.login.repository;

import com.example.login.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {

    User findByEmail (String email);

    User findByUsername (String username);
}
