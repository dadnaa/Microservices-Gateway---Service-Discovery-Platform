package com.esi.msformation;

import com.esi.msformation.entities.Formation;
import com.esi.msformation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRep formationRep ;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Formation F1 = formationRep.save(new Formation(null , "Reseau" , 12,null));
        Formation F2 = formationRep.save(new Formation(null , "Francais" , 15 , null));
        Formation F3 = formationRep.save(new Formation(null , "Musique" , 20, null));



    }
}
