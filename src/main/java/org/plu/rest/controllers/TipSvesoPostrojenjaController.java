package org.plu.rest.controllers;

import org.plu.dao.TipSvesoPostrojenjaRepository;
import org.plu.entities.TipSvesoPostrojenja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipsvesopostrojenja")
public class TipSvesoPostrojenjaController {

    @Autowired
    TipSvesoPostrojenjaRepository repository;

    @GetMapping("/add/{naziv}")
    public String add(@PathVariable(value = "naziv")String naziv){
        TipSvesoPostrojenja postrojenja = new TipSvesoPostrojenja(naziv);
        if(repository.save(postrojenja)!=null){
            return "Success";
        }
        return "Fail!!!";
    }

}
