package com.esi.msscolarite.entities;

import com.esi.msscolarite.Model.Formation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id @GeneratedValue()
    private Long idEtudiant ;
    private  String nom ;
    private Date dateN ;
    private  String promo ;
    private Date dateInscription ;
    @ManyToOne
    private Etablissement etabli ;
    private Long idFormation ;
    @Transient
    private Formation formation ;

}
