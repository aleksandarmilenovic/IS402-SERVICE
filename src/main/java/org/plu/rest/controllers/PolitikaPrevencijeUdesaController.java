package org.plu.rest.controllers;

import org.plu.dao.PolitikaPrevencijeUdesaRepository;
import org.plu.entities.PolitikaPrevencijeUdesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/politijkaprevencijeudesa")
public class PolitikaPrevencijeUdesaController {


    @Autowired
    PolitikaPrevencijeUdesaRepository repository;


    @GetMapping("/add/{ciljevi}/{principdelovanja}/{datum}")
    public String addNew(@PathVariable(value = "ciljevi") String ciljevi,@PathVariable(value = "prinvipdelovanja") String principdelovanja,
                         @PathVariable(value = "datum") int datum){
        PolitikaPrevencijeUdesa udesa = new PolitikaPrevencijeUdesa(ciljevi,principdelovanja,datum);

        if(repository.save(udesa) != null){
            return "Success!!";
        }
        return "Fail";

    }

}
