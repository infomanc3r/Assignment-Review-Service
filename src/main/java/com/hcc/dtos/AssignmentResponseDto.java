package com.hcc.dtos;

import com.hcc.entities.User;
import java.util.List;

/**
 * This class is a Data Transfer Object built for accessing Assignment-object-related data on a datastore while only
 * passing the relevant parameters and "hiding" the rest with the relevant Assignment object.
 */

public class AssignmentResponseDto {

    private Long id;
    private String status;
    private int number;
    private List<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
