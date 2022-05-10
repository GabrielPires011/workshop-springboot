package com.workshop.repository;

import com.workshop.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {

    List<Post> findByTitleContaining(String text);
}
