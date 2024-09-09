package io.github.axelfrache.taskadvisor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String username;
    private String password;

    @OneToMany(mappedBy = "assignedUser")
    private List<Task> tasks;

    @ManyToMany(mappedBy = "users")
    private List<Project> projects;
}