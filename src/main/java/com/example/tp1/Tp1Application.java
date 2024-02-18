package com.example.tp1;

import com.example.tp1.entities.Adresse;
import com.example.tp1.entities.Etudiant;
import com.example.tp1.entities.Formation;
import com.example.tp1.entities.Project;
import com.example.tp1.rep.EtudiantRep;
import com.example.tp1.rep.FormationRep;
import com.example.tp1.rep.ProjectRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationRep formationRep;
    @Autowired
    ProjectRep projectRep;

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation f1 =formationRep.save(new Formation(null,"Web",null));
        Formation f2 =formationRep.save(new Formation(null,"Mobile",null));
        Adresse a1 = new Adresse("حي 55 مسكن",5,31005,"Oran");


        Project p1 = projectRep.save(new Project(null,"ESI HUB",null));
        Project p2 = projectRep.save(new Project(null,"Innovium",null));
        List<Project> projectsList = new ArrayList<>();
        projectsList.add(p1);
        projectsList.add(p2);


        Etudiant e1=etudiantRep.save(new Etudiant(null,"Amine",new Date(),null,a1,f1,projectsList));
        Etudiant e2=etudiantRep.save(new Etudiant(null,"mohamed",new Date(),null,a1,f2,projectsList));
        List<Etudiant> etudiantsList = new ArrayList<>();
        etudiantsList.add(e1);
        etudiantsList.add(e2);
        Project p3 = projectRep.save(new Project(null,"mini projet",etudiantsList));
        projectsList.add(p3);
        Etudiant e3=etudiantRep.save(new Etudiant(null,"brahim",new Date(),null,a1,f2,projectsList));

    }

}
