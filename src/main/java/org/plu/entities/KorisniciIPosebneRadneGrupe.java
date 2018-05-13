package org.plu.entities;

import javax.persistence.*;

@Entity
@Table(name = "korisniciiposebneradnegrupe")
public class KorisniciIPosebneRadneGrupe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int id_korisnika;

    @Column(nullable = false)
    private int psebneRadneGrupe;

    public KorisniciIPosebneRadneGrupe(int id_korisnika, int psebneRadneGrupe) {
        this.id_korisnika = id_korisnika;
        this.psebneRadneGrupe = psebneRadneGrupe;
    }

    public KorisniciIPosebneRadneGrupe(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_korisnika() {
        return id_korisnika;
    }

    public void setId_korisnika(int id_korisnika) {
        this.id_korisnika = id_korisnika;
    }

    public int getPsebneRadneGrupe() {
        return psebneRadneGrupe;
    }

    public void setPsebneRadneGrupe(int psebneRadneGrupe) {
        this.psebneRadneGrupe = psebneRadneGrupe;
    }
}
