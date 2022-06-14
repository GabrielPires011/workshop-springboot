package com.workshop.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@Document(collation = "user")
public class User implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String email;

    @DBRef(lazy = true)
    private List<Post> posts = new ArrayList<>();

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
