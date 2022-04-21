package com.workshop.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post implements Serializable {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Integer id;

    private Date date;
    private String title;
    private String body;
    private User author;


}
