package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.soap.Name;

@Entity
@Table(name = "posebneradnegrupe")
public class PosebneRadneGrupe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private  String naziv;

    @NotBlank
    private String zadaci;

    @Column(nullable = false)
    private int rukovodilac;

    @Column(nullable = false)
    private long datum;

    public PosebneRadneGrupe(String naziv, String zadaci, int rukovodilac, long datum) {
        this.naziv = naziv;
        this.zadaci = zadaci;
        this.rukovodilac = rukovodilac;
        this.datum = datum;
    }

    public PosebneRadneGrupe(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getZadaci() {
        return zadaci;
    }

    public void setZadaci(String zadaci) {
        this.zadaci = zadaci;
    }

    public int getRukovodilac() {
        return rukovodilac;
    }

    public void setRukovodilac(int rukovodilac) {
        this.rukovodilac = rukovodilac;
    }

    public long getDatum() {
        return datum;
    }

    public void setDatum(long datum) {
        this.datum = datum;
    }
}
