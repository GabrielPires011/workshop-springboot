package com.workshop.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
public class UserDTO implements Serializable {

    private Integer id;

    private String name;

    private String email;

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}
