package com.example.demo.Controller;

import com.example.demo.repos.EmployeeRepository;
import com.example.demo.repos.ProjectRepository;
import org.springframework.stereotype.Controller;

    @Controller
    public class ProjectController {

        private ProjectRepository projectRepo;

        public ProjectController(ProjectRepository projectRepo){
            this.projectRepo = projectRepo;

        }
    }
