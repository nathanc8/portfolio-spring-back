package com.exemple.portfolio_backend.controller;

import com.exemple.portfolio_backend.Repository.ProjectRepository;
import com.exemple.portfolio_backend.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAllProjects();
    }

}
