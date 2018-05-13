package org.plu.rest.controllers;

import org.plu.dao.IzvestajBezbednostiIPlanZastiteOdUdesaRepository;
import org.plu.entities.IzvestajBezbednostiIPlanZastiteOdUdesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/izvestajbezbednostiiplanzastitieodudesa")
public class IzvestajBezbednostiIPlanZastiteOdUdesaController {


    @Autowired
    IzvestajBezbednostiIPlanZastiteOdUdesaRepository repository;


    @GetMapping("/add/{first}/{second}/{third}/{forth}/{fifth}/{sixth}/{seventh}/{eight}")
    private String addNew(@PathVariable(value = "first")String first,@PathVariable(value = "second") int second,
                          @PathVariable(value = "third")String third,@PathVariable(value = "forth")String forth,
                          @PathVariable(value = "fifth")String fifth,@PathVariable(value = "sixth")String sixth,
                          @PathVariable(value = "seventh") int seventh,@PathVariable(value = "eight") int eight){

        IzvestajBezbednostiIPlanZastiteOdUdesa udesa = new IzvestajBezbednostiIPlanZastiteOdUdesa(first,second,third,forth,fifth,sixth,seventh,eight);
        if(repository.save(udesa)!=null){
            return "Success!!";
        }
        return "Faill!!!";

    }
}
