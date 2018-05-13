package org.plu.rest.controllers;

import org.plu.dao.PopisOpasnihMaterijaRepository;
import org.plu.entities.PopisOpasnihMaterija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/popisospasnihmaterija")
public class PopisOpasnihMaterijaController {

    @Autowired
    PopisOpasnihMaterijaRepository popisOpasnihMaterijaRepository;


    @GetMapping("/add/{iom}/{iibipzod}/{ioou}/{kol}")
    public String add(@PathVariable(name = "iom") int iom,@PathVariable(name = "iibipzod") int iibipzod,
                      @PathVariable(name = "ioou") int ioou,@PathVariable(name = "kol")int kol){
        PopisOpasnihMaterija materija = new PopisOpasnihMaterija(iom,iibipzod,ioou,kol);
        if(popisOpasnihMaterijaRepository.save(materija) != null){
            return "Success!!!";
        }
        return "Fail!!";
    }

    @GetMapping("/all")
    public List<PopisOpasnihMaterija> getAll(){
        return popisOpasnihMaterijaRepository.findAll();
    }
}
