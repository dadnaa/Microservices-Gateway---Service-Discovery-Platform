package com.esi.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id @GeneratedValue()
    private Long idEtablissement ;
    private String nom;
    @OneToMany(mappedBy ="etabli")
    @JsonIgnore
    private List<Etudiant> etudiants;


}
