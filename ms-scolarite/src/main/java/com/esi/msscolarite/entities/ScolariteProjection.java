package com.esi.msscolarite.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = {Etudiant.class}, name = "tobourse")
public interface ScolariteProjection{
    @Value("#{target.nom}")
    String getNom();

    @Value("#{target.promo}")
    String getPromo();


    @Value("#{target.dateInscription}")
    Date getDateInscription();


    @Value("#{target.etabli.nom}")
    String getNomEtablissement();
}







