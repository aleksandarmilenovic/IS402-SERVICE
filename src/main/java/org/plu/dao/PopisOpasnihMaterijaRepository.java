package org.plu.dao;

import org.plu.entities.PopisOpasnihMaterija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopisOpasnihMaterijaRepository extends JpaRepository<PopisOpasnihMaterija,Integer> {
}
