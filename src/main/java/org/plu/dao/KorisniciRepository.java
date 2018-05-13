package org.plu.dao;

import org.plu.entities.Korisnici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KorisniciRepository  extends JpaRepository<Korisnici,Long>{
}
