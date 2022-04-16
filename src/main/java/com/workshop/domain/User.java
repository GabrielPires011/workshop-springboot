package com.workshop.domain;


import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {

    private String id;
    private String name;
    private String email;

}
