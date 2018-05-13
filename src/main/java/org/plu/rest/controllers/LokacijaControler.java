package org.plu.rest.controllers;

import org.plu.dao.LokacijaRepository;
import org.plu.entities.Lokacija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lokacija")
public class LokacijaControler {

    @Autowired
    LokacijaRepository lokacijaRepository;

    @GetMapping("/new/{grad}/{adresa}/{opis}")
    public String addNew(@PathVariable(value = "grad")String grad,@PathVariable(value = "adresa")String adresa,
                         @PathVariable(value = "opis")String opis){
        Lokacija lokacija = new Lokacija(grad,adresa,opis);
        if(lokacijaRepository.save(lokacija) != null){
            return "Success!!";
        }
        return "Fail!!";
    }

    @GetMapping("/all")
    public List<Lokacija> getAll(){
        return lokacijaRepository.findAll();
    }
}
