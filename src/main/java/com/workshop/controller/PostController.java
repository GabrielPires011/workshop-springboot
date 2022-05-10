package com.workshop.controller;

import com.workshop.domain.Post;
import com.workshop.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(path ="/{id}")
    public ResponseEntity<Post> findById(@PathVariable Integer id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
