package org.plu.dao;

import org.plu.entities.JavneUsluge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavneUslugeRepository extends JpaRepository<JavneUsluge,Integer>{
}
