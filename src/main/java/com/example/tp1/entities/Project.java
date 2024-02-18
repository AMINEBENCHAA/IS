package com.example.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;

    @Column(nullable = false)
    private  String name;

    @ManyToMany(mappedBy = "lesProjets")
    private List<Etudiant> lesEtudiants;
}
