package com.hcc.dtos;

import java.io.Serializable;

/**
 *  A response DTO to be returned upon successful authentication.
 *  Contains the JWT token.
 */
public class AuthCredentialResponse implements Serializable {
    private static final long serialVersionUID = 1054496075689865094L;
    private final String jwtToken;

    public AuthCredentialResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getToken() {
        return this.jwtToken;
    }
}