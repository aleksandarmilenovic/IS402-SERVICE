package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "tipsvesopostrojenja")
public class TipSvesoPostrojenja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotBlank
    private String naziv;

    public TipSvesoPostrojenja(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }
}
