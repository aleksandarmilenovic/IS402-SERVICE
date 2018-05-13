package org.plu.rest.controllers;

import org.plu.dao.OpasneMaterijeRepository;
import org.plu.entities.OpasneMaterije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/opasnematerije")
public class OpasneMaterijeContoller {

    @Autowired
    OpasneMaterijeRepository opasneMaterijeRepository;


    @GetMapping("/new/{naziv}")
    public String addNew(@PathVariable(value = "naziv")String naziv){
        OpasneMaterije opasneMaterije = new OpasneMaterije(naziv);
        if(opasneMaterijeRepository.save(opasneMaterije) != null){
            return "Success!!";
        }
        return "Fail!!";
    }

    @GetMapping("/all")
    public List<OpasneMaterije> getAll(){
    return opasneMaterijeRepository.findAll();
    }
}
