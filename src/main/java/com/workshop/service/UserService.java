package com.workshop.service;

import com.workshop.domain.User;
import com.workshop.repository.UserRepository;
import com.workshop.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

    public Optional<User> findById(Integer id) {
        var obj = userRepository.findById(id);
        return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException("object not found")));
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
