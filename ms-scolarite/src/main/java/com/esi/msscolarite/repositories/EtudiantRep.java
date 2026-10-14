package com.esi.msscolarite.repositories;

import com.esi.msscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRep  extends JpaRepository<Etudiant,Long> {


    List<Etudiant> findByIdFormation(Long idf);

    List<Etudiant> findByIdEtudiant(Long id);

}
