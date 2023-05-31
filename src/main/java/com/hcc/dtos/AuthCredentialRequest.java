package com.hcc.dtos;

/**
 * This class is a Data Transfer Object built for making queries related to Security credentials while only passing the
 * relevant parameters and "hiding" the rest within the relevant User object.
 */
public class AuthCredentialRequest {

    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
