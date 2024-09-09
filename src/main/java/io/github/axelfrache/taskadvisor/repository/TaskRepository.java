package io.github.axelfrache.taskadvisor.repository;

import io.github.axelfrache.taskadvisor.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, long> {
}