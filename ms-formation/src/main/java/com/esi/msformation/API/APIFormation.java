package com.esi.msformation.API;

import com.esi.msformation.Proxy.EtudiantProxy;
import com.esi.msformation.entities.Formation;
import com.esi.msformation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class APIFormation {

    @Autowired
    FormationRep formationRep ;
    @Autowired
    private EtudiantProxy etudiantProxy ;

    @GetMapping("formations/{id}")
     Formation getFormationAvecEtudiants(@PathVariable("id") Long idf) {
        Formation f = formationRep.findById(idf).get();
//        f.setEtudiants(etudiantProxy.getEtudiants(ide, "toformation"));
        f.setEtudiants(new ArrayList<>(etudiantProxy.getEtudiants(idf,"toformation").getContent()));
        return f;
    }
}
 // pourquoi etudiants est vide malgre tout marche bien