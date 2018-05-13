package org.plu.dao;

import org.plu.entities.TipSvesoPostrojenja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipSvesoPostrojenjaRepository extends JpaRepository<TipSvesoPostrojenja,Integer>{
}
