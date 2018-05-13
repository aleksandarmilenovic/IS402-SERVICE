package org.plu.dao;

import org.plu.entities.ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ObavestenjeZaOpasneMaterijeIObavestenjeOUdesuRepository extends JpaRepository<ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu,Integer>{
}
