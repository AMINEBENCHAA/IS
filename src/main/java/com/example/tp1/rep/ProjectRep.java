package com.example.tp1.rep;

import com.example.tp1.entities.Formation;
import com.example.tp1.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectRep extends JpaRepository<Project,Long> {

}
