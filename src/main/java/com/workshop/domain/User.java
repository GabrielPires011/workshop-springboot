package com.workshop.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "email", unique = true)
    private String email;
}
