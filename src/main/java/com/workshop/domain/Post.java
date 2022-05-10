package com.workshop.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Setter
@Getter
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

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(Integer id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
