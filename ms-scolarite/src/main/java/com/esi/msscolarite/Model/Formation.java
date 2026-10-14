package com.esi.msscolarite.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {
    private Long idFormation ; //kima idFormation li fi formation
    private  String nom ;
    private int duree ;

}
