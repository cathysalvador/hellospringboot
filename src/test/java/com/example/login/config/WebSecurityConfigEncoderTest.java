package com.example.login.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class WebSecurityConfigEncoderTest {


    @Test
    public void encodePassword() {

        String hashed = BCrypt.hashpw("pass123", BCrypt.gensalt(12));
        System.out.println("password:" + hashed);

    }


}
