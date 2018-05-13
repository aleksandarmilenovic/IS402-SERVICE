package org.plu.rest.controllers;

import org.plu.dao.JavneUslugeRepository;
import org.plu.entities.JavneUsluge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/javneusluge")
public class JavneUslugeControler {

    @Autowired
    JavneUslugeRepository javneUslugeRepository;

    @GetMapping("/new/{usluga}")
    public String addNew(@PathVariable(value = "usluga") String usluga){
        JavneUsluge javneUsluge = new JavneUsluge(usluga);
        if(javneUslugeRepository.save(javneUsluge) != null){
            return "Success!!!";
        }
        return "Fail!!";
    }

    @GetMapping("/all")
    public List<JavneUsluge> getAll(){
        return javneUslugeRepository.findAll();
    }
}
