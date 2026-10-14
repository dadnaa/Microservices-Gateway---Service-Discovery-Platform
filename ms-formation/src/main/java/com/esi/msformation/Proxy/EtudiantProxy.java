package com.esi.msformation.Proxy;

import com.esi.msformation.Model.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-scolarite" , url = "http://localhost:8083")

public interface EtudiantProxy {

@GetMapping("/etudiants/search/findByIdFormation")
CollectionModel<Etudiant> getEtudiants(@RequestParam("idFormation")
                                Long idFormation ,
                                                 @RequestParam("projection")
                                String projection);
}