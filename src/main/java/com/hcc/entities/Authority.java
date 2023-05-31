package com.hcc.entities;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 *  This class represents an Authority entity and associates a role assigned to a specific User. It is mapped to the
 *  "authorities" table with a persistent generated id stored as a long acting as the primary key.
 */

@Entity
@Table(name = "authorities")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
    private User user;

    public Authority(String authority) {
        this.authority = authority;
    }

    public Authority() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
