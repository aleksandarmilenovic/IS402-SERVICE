package org.plu.dao;

import org.plu.entities.PolitikaPrevencijeUdesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolitikaPrevencijeUdesaRepository extends JpaRepository<PolitikaPrevencijeUdesa,Integer>{
}
