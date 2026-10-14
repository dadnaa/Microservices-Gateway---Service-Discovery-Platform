package com.esi.msscolarite.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantBourse {
    private Long idEtudiant;
    private String nom;
    private String promo;
    private Date dateInscription;
    private String nomEtablissement;
}