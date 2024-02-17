package com.example.tp1.rep;

import com.example.tp1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface EtudiantRep extends JpaRepository<Etudiant,Long> {}

