package com.workshop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class PostDTO implements Serializable {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Integer id;
    private User author;

    public PostDTO

}
