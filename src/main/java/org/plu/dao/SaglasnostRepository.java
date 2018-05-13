package org.plu.dao;

import org.plu.entities.Saglasnosti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaglasnostRepository extends JpaRepository<Saglasnosti,Integer>{
}
