package com.workshop.confg;

import com.workshop.domain.User;
import com.workshop.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public interface Instantiation extends CommandLineRunner {

    @Override
    public default void run(String... arg0) throws Exception {

        UserRepository userRepository = null;

        userRepository.deleteAll();

        User maria = new User(1, "Maria Brown", "maria@gmail.com");
        User alex = new User(2, "Alex Green", "alex@gmail.com");
        User bob = new User(3, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
