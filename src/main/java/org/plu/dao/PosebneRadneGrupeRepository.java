package org.plu.dao;

import org.plu.entities.PosebneRadneGrupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosebneRadneGrupeRepository extends JpaRepository<PosebneRadneGrupe,Integer> {
}
