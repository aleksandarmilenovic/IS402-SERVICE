package org.plu.rest.controllers;

import org.plu.dao.PosebneRadneGrupeRepository;
import org.plu.entities.PosebneRadneGrupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posebneradnegrupe")
public class PosebneRadneGrupeControler {

    @Autowired
    PosebneRadneGrupeRepository posebneRadneGrupeRepository;


    @GetMapping("/new/{naziv}/{zadaci}/{rukovodilac}/{datum}")
    public String addNew(@PathVariable(value = "naziv")String naziv,@PathVariable(value = "zadaci")String zadaci,
                         @PathVariable(value = "rukovodilac")int rukovodilac,@PathVariable(value = "datum") long datum){
        PosebneRadneGrupe grupe = new PosebneRadneGrupe(naziv,zadaci,rukovodilac,datum);
        if(posebneRadneGrupeRepository.save(grupe) != null){
            return "Success!!!";
        }
        return "Fail!!!";
    }

    @GetMapping("/all")
    public List<PosebneRadneGrupe> getAll(){
       return posebneRadneGrupeRepository.findAll();
    }



}
