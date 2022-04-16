package com.workshop.resource;

import com.workshop.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User pedro = new User("1", "Pedro Silva", "pedro@gmail.com");
        User Alex = new User("2", "Alex Silva", "pedro@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(pedro, Alex));
        return ResponseEntity.ok().body(list);
    }
}
