package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long Id;
    private String projectName;

    @OneToMany(mappedBy = "projects")
    private Collection<EmployeeProject> projects;

    public Project(){

   }

    public String getProjectName() {
        return projectName;
    }

    public Collection<EmployeeProject> getProjects() {
        return projects;
    }

    public Project(String projectName){
        this.projectName= projectName;
    }

}
