package org.plu.dao;

import org.plu.entities.OpasneMaterije;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpasneMaterijeRepository extends JpaRepository<OpasneMaterije,Integer>{
}
