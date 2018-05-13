package org.plu.dao;

import org.plu.entities.IzvestajBezbednostiIPlanZastiteOdUdesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzvestajBezbednostiIPlanZastiteOdUdesaRepository extends JpaRepository<IzvestajBezbednostiIPlanZastiteOdUdesa,Integer>{
}
