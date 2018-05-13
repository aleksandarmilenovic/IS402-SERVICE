package org.plu.rest.controllers;

import org.plu.dao.KorisniciRepository;
import org.plu.entities.Korisnici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/korisnici")
public class KorisniciController {


    @Autowired
    KorisniciRepository korisniciRepository;

    @GetMapping("/login/{username}/{password}")
    public Korisnici login(@PathVariable(value = "username") String username,@PathVariable(value = "password") String password){
        List<Korisnici> all = korisniciRepository.findAll();
        for(Korisnici k : all){
            if(k.getUsername().equals(username) && k.getPassword().equals(password)) {
                return k;
            }
        }
        return null;
    }
    @GetMapping("/registracija/{ime}/{prezime}/{username}/{password}/{privilegue}")
    public String registacija(@PathVariable(value = "ime")String ime,@PathVariable(value = "prezime") String prezime,
                              @PathVariable(value = "username")String username,@PathVariable(value = "password")String password,
                              @PathVariable(value = "privilegue") int privilegue){

        Korisnici korisnici = new Korisnici(ime,prezime,username,password,privilegue);
        if(korisniciRepository.save(korisnici) != null){
            return "Success!!!";
        }

        return "Fail!!!";
    }

    @GetMapping("/all")
    public List<Korisnici> getall(){
        return korisniciRepository.findAll();
    }
}
