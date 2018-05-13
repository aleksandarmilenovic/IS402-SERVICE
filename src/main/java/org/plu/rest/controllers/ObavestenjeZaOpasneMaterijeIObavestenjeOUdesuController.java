package org.plu.rest.controllers;

import org.plu.dao.ObavestenjeZaOpasneMaterijeIObavestenjeOUdesuRepository;
import org.plu.entities.ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obavestenjezaopasnematerijeiobavestenjeoudesu")
public class ObavestenjeZaOpasneMaterijeIObavestenjeOUdesuController {

    @Autowired
    ObavestenjeZaOpasneMaterijeIObavestenjeOUdesuRepository repositorythis;

    @GetMapping("/add/{first}/{second}")
    public String add(@PathVariable(value = "first") int first,@PathVariable(value = "second")int second){
        ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu udesu = new ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu(first,second);
        if(repositorythis.save(udesu)!= null){
            return "Success!!!";
        }
        return "Fail!!";

    }
}
