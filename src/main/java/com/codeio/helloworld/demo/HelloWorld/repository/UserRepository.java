package com.codeio.helloworld.demo.HelloWorld.repository;

import com.codeio.helloworld.demo.HelloWorld.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
