package com.esi.msscolarite;

import com.esi.msscolarite.entities.Etablissement;
import com.esi.msscolarite.entities.Etudiant;
import com.esi.msscolarite.repositories.EtablissementRep;
import com.esi.msscolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication  implements CommandLineRunner {
    @Autowired
    EtudiantRep etudiantRep ;
    @Autowired
    EtablissementRep etablissementRep ;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablissement Etab1 = etablissementRep.save(new Etablissement(null,"Esi"  , null ));
        Etablissement Etab2 = etablissementRep.save(new Etablissement(null,"Enstin"  , null ));

        Etudiant E1 =(etudiantRep.save(new Etudiant(null,"Esma" , null , null, null ,Etab1,1L,null)));
        Etudiant E2 =(etudiantRep.save(new Etudiant(null,"Amin" , null , null, null, Etab2 ,2L,null)));
        Etudiant E3=(etudiantRep.save(new Etudiant(null,"Anis" , null , null, null ,Etab1,1L,null)));
        Etudiant E4 =(etudiantRep.save(new Etudiant(null,"Ahmed" , null , null, null, Etab2 ,2L,null)));
        Etudiant E5 =(etudiantRep.save(new Etudiant(null,"Yasser" , null, null, null ,Etab1,1L,null)));
        Etudiant E6 =(etudiantRep.save(new Etudiant(null,"Houda" , null , null, null, Etab2 ,3L,null)));

    }
}
