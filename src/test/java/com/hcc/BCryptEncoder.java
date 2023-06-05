package com.hcc;

import com.hcc.utils.CustomPasswordEncoder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCryptEncoder {
    @Test
    public void bcryptEncode() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("testpassword"));
    } // testpassword: $2a$10$gDMs9QOLGuVUu1h2u86C2O5cLpsERzHR403yQnthOdHpUIRaCdEXK

}
