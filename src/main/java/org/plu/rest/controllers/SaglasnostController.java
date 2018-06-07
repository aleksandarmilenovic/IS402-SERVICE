package org.plu.rest.controllers;


import org.plu.dao.SaglasnostRepository;
import org.plu.entities.Saglasnosti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/saglasnost")
public class SaglasnostController {


    @Autowired
    SaglasnostRepository saglasnostRepository;


    @GetMapping("/add/{first}/{second}/{third}/{forth}")
    public String addNew(@PathVariable(value = "first") int first,@PathVariable(value = "second")int second,
                         @PathVariable(value = "third") String third,@PathVariable(value = "forth")String forth){
        Saglasnosti saglasnosti = new Saglasnosti(first,second,third,forth);
        if(saglasnostRepository.save(saglasnosti)!=null){
            return "Success!!!";
        }
        return "Failed";

    }
    @GetMapping("/all")
    public List<Saglasnosti> getAll(){
        return  saglasnostRepository.findAll();
    }

}
