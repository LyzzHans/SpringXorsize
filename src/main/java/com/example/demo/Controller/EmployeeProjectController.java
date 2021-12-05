package com.example.demo.Controller;


import com.example.demo.repos.EmployeeProjectRepository;
import com.example.demo.repos.ProjectRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeProjectController {
    private EmployeeProjectRepository employeeProjectRepo;

    public EmployeeProjectController(EmployeeProjectRepository employeeProjectRepo){
        this.employeeProjectRepo = employeeProjectRepo;

    }
}
