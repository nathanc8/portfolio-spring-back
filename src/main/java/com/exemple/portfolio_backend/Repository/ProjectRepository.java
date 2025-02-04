package com.exemple.portfolio_backend.Repository;

import com.exemple.portfolio_backend.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("SELECT p from Project p")
    List<Project> findAllProjects();

}
