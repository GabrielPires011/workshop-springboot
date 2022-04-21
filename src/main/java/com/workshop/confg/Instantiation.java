package com.workshop.confg;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import com.workshop.domain.Post;
import com.workshop.domain.User;
import com.workshop.repository.PostRepository;
import com.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postReposiroty;

    @Override
    public void run(String... arg0) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));


        userRepository.deleteAll();
        postReposiroty.deleteAll();

        User maria = new User(1, "Maria Brown", "maria@gmail.com");
        User alex = new User(2, "Alex Green", "alex@gmail.com");
        User bob = new User(3, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);


        postReposiroty.saveAll(Arrays.asList(post1, post2));

    }
}
