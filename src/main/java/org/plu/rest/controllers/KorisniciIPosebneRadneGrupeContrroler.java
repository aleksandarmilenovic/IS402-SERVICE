package org.plu.rest.controllers;

import org.plu.dao.KorisniciIPosebneRadneGruoeRepository;
import org.plu.entities.KorisniciIPosebneRadneGrupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/korisniciiposebneradnegrupe")
public class KorisniciIPosebneRadneGrupeContrroler {

    @Autowired
    KorisniciIPosebneRadneGruoeRepository korisniciIPosebneRadneGruoeRepository;

    @GetMapping("/new/{idkorisnika}/{idGrupe}")
    public String addnew(@PathVariable(value = "idkorisnika") int idkorisnika,@PathVariable(value = "idGrupe")int idGrupe){
        KorisniciIPosebneRadneGrupe korisniciIPosebneRadneGrupe = new KorisniciIPosebneRadneGrupe(idkorisnika,idGrupe);
        if(korisniciIPosebneRadneGruoeRepository.save(korisniciIPosebneRadneGrupe) != null){
            return "Success!!";
        }
        return "FAIL!!";
    }

    @GetMapping("/all")
    public List<KorisniciIPosebneRadneGrupe> getAll(){
        return korisniciIPosebneRadneGruoeRepository.findAll();
    }

}
