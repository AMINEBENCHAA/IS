package com.example.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    private  String name;


    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private Byte[] Photo;

    @Embedded
    private Adresse adresse;

    @ManyToOne
    private Formation formation;
    @ManyToMany
    @JoinTable(name="work",
                joinColumns=@JoinColumn(name="idEtudiant"),
                inverseJoinColumns=@JoinColumn(name="idProject"))
    private List<Project> lesProjets;
}
