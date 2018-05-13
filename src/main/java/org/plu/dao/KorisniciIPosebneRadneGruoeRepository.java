package org.plu.dao;

import org.plu.entities.KorisniciIPosebneRadneGrupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KorisniciIPosebneRadneGruoeRepository extends JpaRepository<KorisniciIPosebneRadneGrupe,Integer>{
}
