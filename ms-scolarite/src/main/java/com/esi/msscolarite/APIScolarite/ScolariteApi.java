package com.esi.msscolarite.APIScolarite;


import com.esi.msscolarite.Model.Formation;
import com.esi.msscolarite.Proxy.FormationProxy;
import com.esi.msscolarite.entities.Etudiant;
import com.esi.msscolarite.repositories.EtablissementRep;
import com.esi.msscolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ScolariteApi {

    @Autowired
    EtudiantRep etudiantRep ;
    @Autowired
    EtablissementRep  etablissementRep ;
    @Autowired
    FormationProxy formationProxy;
    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiantAvecFormation(@PathVariable("id") Long ide) {
        Etudiant e = etudiantRep.findById(ide).get();
        Formation f = formationProxy.getFormation(e.getIdFormation());
        e.setFormation(f);
        return e;
    }

//    @GetMapping("/bourses/{id}")
//    public EtudiantBourse getEtudiantBourse(@PathVariable("id") Long id) {
//        Etudiant etudiant = etudiantRep.findById(id).get();
//        return new EtudiantBourse(
//                etudiant.getIdEtudiant(),
//                etudiant.getNom(),
//                etudiant.getPromo(),
//                etudiant.getDateInscription(),
//                etudiant.getEtabli().getNom()
//        );




}
