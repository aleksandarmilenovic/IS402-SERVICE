package org.plu.dao;

import org.plu.entities.ObavestanjeZaOpasneMaterije;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObavestanjeZaOpasneMaterijeRepository extends JpaRepository<ObavestanjeZaOpasneMaterije,Integer>{
}
