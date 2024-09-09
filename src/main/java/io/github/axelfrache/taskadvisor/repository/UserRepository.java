package io.github.axelfrache.taskadvisor.repository;

import io.github.axelfrache.taskadvisor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}
