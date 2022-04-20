package com.workshop.repository;

import com.workshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from user u" +
            " where u.id = :id ", nativeQuery = true)
    User buscarPeloID(@RequestParam("id") Integer id);


}
