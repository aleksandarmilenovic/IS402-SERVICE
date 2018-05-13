package org.plu.rest.controllers;

import org.plu.dao.ObavestenjeOUdesuRepository;
import org.plu.entities.ObavestenjeOUdesu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obavestenjeoudesu")
public class ObavestenjeOUdesuController {

    @Autowired
    ObavestenjeOUdesuRepository udesuRepository;

    @GetMapping("/add/{first}/{second}/{third}/{forth}/{fifth}/{sixth}")
    public String addNew(@PathVariable(value = "first") String first,@PathVariable(value = "second") String second,
                         @PathVariable(value = "third") String third,@PathVariable(value = "forth") String forth,
                         @PathVariable(value = "fifth") String fifth,@PathVariable(value = "sixth") String sixth){

        ObavestenjeOUdesu udesu = new ObavestenjeOUdesu(first,second,third,forth,fifth,sixth);
        if(udesuRepository.save(udesu)!=null){
            return "Success";
        }
        return "Fail";

    }

}
