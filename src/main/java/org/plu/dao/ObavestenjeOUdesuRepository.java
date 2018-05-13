package org.plu.dao;

import org.plu.entities.ObavestenjeOUdesu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObavestenjeOUdesuRepository extends JpaRepository<ObavestenjeOUdesu,Integer>{
}
