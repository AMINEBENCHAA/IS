package com.example.tp1.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Adresse implements Serializable {
    private String rue;
    private int numero;
    private int codePostal;
    private String  ville;
}
