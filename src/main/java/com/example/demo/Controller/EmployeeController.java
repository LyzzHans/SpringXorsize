package com.example.demo.Controller;

import com.example.demo.repos.EmployeeRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    private EmployeeRepository employeeRepo;

    public EmployeeController(EmployeeRepository employeeRepo){
        this.employeeRepo = employeeRepo;
    }

}


