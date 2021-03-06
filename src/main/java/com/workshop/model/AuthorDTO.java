package com.workshop.model;

import com.workshop.domain.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;


@Data
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private Integer id;
    private String name;

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

}
