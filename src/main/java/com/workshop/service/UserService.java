package com.workshop.service;

import com.workshop.domain.User;
import com.workshop.domain.UserDTO;
import com.workshop.repository.UserRepository;
import com.workshop.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.Collections;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transient
    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

    public Optional<User> findById(Integer id) {
        var obj = userRepository.findById(id);
        return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException("object not found")));
    }

    public UserDTO findAll() {
        return (UserDTO) userRepository.findAll();
    }

    public void delete(Integer id) {
        findById(id);
        userRepository.deleteById(id);
    }
}
