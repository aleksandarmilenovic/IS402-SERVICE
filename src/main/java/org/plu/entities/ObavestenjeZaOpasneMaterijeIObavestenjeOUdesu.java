package org.plu.entities;

import javax.persistence.*;

@Entity
@Table(name = "obavestenjezaopasnematerijeiobavestenjeoudesu")
public class ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int obavestenje_za_opsane_materije;

    @Column(nullable = false)
    private int obavestenje_o_udesu;

    public ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu(){

    }

    public ObavestenjeZaOpasneMaterijeIObavestenjeOUdesu(int obavestenje_za_opsane_materije, int obavestenje_o_udesu) {
        this.obavestenje_za_opsane_materije = obavestenje_za_opsane_materije;
        this.obavestenje_o_udesu = obavestenje_o_udesu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObavestenje_za_opsane_materije() {
        return obavestenje_za_opsane_materije;
    }

    public void setObavestenje_za_opsane_materije(int obavestenje_za_opsane_materije) {
        this.obavestenje_za_opsane_materije = obavestenje_za_opsane_materije;
    }

    public int getObavestenje_o_udesu() {
        return obavestenje_o_udesu;
    }

    public void setObavestenje_o_udesu(int obavestenje_o_udesu) {
        this.obavestenje_o_udesu = obavestenje_o_udesu;
    }
}
