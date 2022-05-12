package com.workshop.service;

import com.workshop.domain.User;
import com.workshop.model.UserDTO;
import com.workshop.repository.UserRepository;
import com.workshop.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transient
    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(Integer id) {
        findById(id);
        userRepository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
