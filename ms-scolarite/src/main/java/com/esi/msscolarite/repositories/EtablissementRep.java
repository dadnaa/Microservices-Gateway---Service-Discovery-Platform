package com.esi.msscolarite.repositories;

import com.esi.msscolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRep  extends JpaRepository<Etablissement,Long> {
}
