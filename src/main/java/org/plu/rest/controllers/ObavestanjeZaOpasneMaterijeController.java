package org.plu.rest.controllers;

import org.plu.dao.ObavestanjeZaOpasneMaterijeRepository;
import org.plu.entities.ObavestanjeZaOpasneMaterije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obavestenjezaopasnematerije")
public class ObavestanjeZaOpasneMaterijeController {

    @Autowired
    ObavestanjeZaOpasneMaterijeRepository repository;

    @GetMapping("/add/{first}/{second}/{third}/{forth}/{fifth}/{sixth}")
    public String addNew(@PathVariable(value = "first") int first,@PathVariable(value = "second") int second,
                         @PathVariable(value = "third") int third,@PathVariable(value = "forth") int forth,
                         @PathVariable(value = "fifth") int fifth,@PathVariable(value = "sixth") int sixth){

        ObavestanjeZaOpasneMaterije materije = new ObavestanjeZaOpasneMaterije(first,second,third,forth,fifth,sixth);

        if(repository.save(materije)!=null){
            return "Success!!";
        }
        return "Fail!!!";


    }
}
