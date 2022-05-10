package com.workshop.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "post")
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private Date date;
    private String title;
    private String body;

    private AuthorDTO author;
}
