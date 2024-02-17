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

    @ManyToMany
    @JoinTable(name="work",
            joinColumns=@JoinColumn(name="idProject"),
            inverseJoinColumns=@JoinColumn(name="idEtudiant"))
    private List<Etudiant> lesEtudiants;
}
