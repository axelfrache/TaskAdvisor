package io.github.axelfrache.taskadvisor.repository;

import io.github.axelfrache.taskadvisor.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}