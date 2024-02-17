package com.example.tp1;

import com.example.tp1.entities.Adresse;
import com.example.tp1.entities.Etudiant;
import com.example.tp1.entities.Formation;
import com.example.tp1.rep.EtudiantRep;
import com.example.tp1.rep.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation f1 =formationRep.save(new Formation(null,"Web",null));
        Formation f2 =formationRep.save(new Formation(null,"Mobile",null));
        Adresse a1 = new Adresse("حي 55 مسكن",5,31005,"Oran");
        Etudiant e1=etudiantRep.save(new Etudiant(null,"Amine",new Date(),null,a1,f1));



    }

}
