package com.hcc.dtos;

import java.io.Serializable;

/**
 * This class is a Data Transfer Object built for making queries related to Security credentials while only passing the
 * relevant parameters and "hiding" the rest within the relevant User object.
 */
public class AuthCredentialRequest implements Serializable {
    private static final long serialVersionUID = 7069327397124195435L;
    private String username;
    private String password;
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

}
