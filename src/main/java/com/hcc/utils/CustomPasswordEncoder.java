package com.hcc.utils;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


/**
 * This class defines the encoder we to encode passwords.
 * It currently uses a BCryptPasswordEncoder, but this can be changed to another encoder if desired.
 */
@Component
public class CustomPasswordEncoder {
    private PasswordEncoder passwordEncoder;

    public CustomPasswordEncoder(){
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public PasswordEncoder getPasswordEncoder(){
        return passwordEncoder;
    }
}
