package com.example.first;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserByUsername(String username);
   Boolean existsUserByUsername(String username);
   Boolean existsUserByEmail(String email);
}
