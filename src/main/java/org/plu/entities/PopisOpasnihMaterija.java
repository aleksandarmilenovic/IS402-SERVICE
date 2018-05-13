package org.plu.entities;

import javax.persistence.*;

@Entity
@Table(name = "popisopasnihmaterija")
public class PopisOpasnihMaterija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int id_opsane_materije;

    @Column(nullable = false)
    private int id_izvestaj_bezbednosti_i_plan_zastite_od_udesa;

    @Column(nullable = false)
    private int id_obavestenje_o_udesu;

    @Column(nullable = false)
    private int kolicina;

    public PopisOpasnihMaterija(){}

    public PopisOpasnihMaterija(int id_opsane_materije, int id_izvestaj_bezbednosti_i_plan_zastite_od_udesa, int id_obavestenje_o_udesu, int kolicina) {
        this.id_opsane_materije = id_opsane_materije;
        this.id_izvestaj_bezbednosti_i_plan_zastite_od_udesa = id_izvestaj_bezbednosti_i_plan_zastite_od_udesa;
        this.id_obavestenje_o_udesu = id_obavestenje_o_udesu;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_opsane_materije() {
        return id_opsane_materije;
    }

    public void setId_opsane_materije(int id_opsane_materije) {
        this.id_opsane_materije = id_opsane_materije;
    }

    public int getId_izvestaj_bezbednosti_i_plan_zastite_od_udesa() {
        return id_izvestaj_bezbednosti_i_plan_zastite_od_udesa;
    }

    public void setId_izvestaj_bezbednosti_i_plan_zastite_od_udesa(int id_izvestaj_bezbednosti_i_plan_zastite_od_udesa) {
        this.id_izvestaj_bezbednosti_i_plan_zastite_od_udesa = id_izvestaj_bezbednosti_i_plan_zastite_od_udesa;
    }

    public int getId_obavestenje_o_udesu() {
        return id_obavestenje_o_udesu;
    }

    public void setId_obavestenje_o_udesu(int id_obavestenje_o_udesu) {
        this.id_obavestenje_o_udesu = id_obavestenje_o_udesu;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}
