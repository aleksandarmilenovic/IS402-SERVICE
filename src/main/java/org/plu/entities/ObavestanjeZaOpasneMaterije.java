package org.plu.entities;

import javax.persistence.*;

@Entity
@Table(name = "obavestenjezaopasnematerije")
public class ObavestanjeZaOpasneMaterije {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(nullable = false)
    private int id_korisnika;

    @Column(nullable = false)
    private int id_tip_sveso_postrojanja;

    @Column(nullable = false)
    private int datum_id_sveso_postrojanja;

    @Column(nullable = false)
    private int politika_prevencije_udesa;

    @Column(nullable = false)
    private int izvestaj_bezbednosti_i_nacin_zastite;

    @Column(nullable = false)
    private int obavestenje_o_udesu;

    public ObavestanjeZaOpasneMaterije(){}

    public ObavestanjeZaOpasneMaterije(int id_korisnika, int id_tip_sveso_postrojanja, int datum_id_sveso_postrojanja, int politika_prevencije_udesa, int izvestaj_bezbednosti_i_nacin_zastite, int obavestenje_o_udesu) {
        this.id_korisnika = id_korisnika;
        this.id_tip_sveso_postrojanja = id_tip_sveso_postrojanja;
        this.datum_id_sveso_postrojanja = datum_id_sveso_postrojanja;
        this.politika_prevencije_udesa = politika_prevencije_udesa;
        this.izvestaj_bezbednosti_i_nacin_zastite = izvestaj_bezbednosti_i_nacin_zastite;
        this.obavestenje_o_udesu = obavestenje_o_udesu;
    }

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

    public int getId_tip_sveso_postrojanja() {
        return id_tip_sveso_postrojanja;
    }

    public void setId_tip_sveso_postrojanja(int id_tip_sveso_postrojanja) {
        this.id_tip_sveso_postrojanja = id_tip_sveso_postrojanja;
    }

    public int getDatum_id_sveso_postrojanja() {
        return datum_id_sveso_postrojanja;
    }

    public void setDatum_id_sveso_postrojanja(int datum_id_sveso_postrojanja) {
        this.datum_id_sveso_postrojanja = datum_id_sveso_postrojanja;
    }

    public int getPolitika_prevencije_udesa() {
        return politika_prevencije_udesa;
    }

    public void setPolitika_prevencije_udesa(int politika_prevencije_udesa) {
        this.politika_prevencije_udesa = politika_prevencije_udesa;
    }

    public int getIzvestaj_bezbednosti_i_nacin_zastite() {
        return izvestaj_bezbednosti_i_nacin_zastite;
    }

    public void setIzvestaj_bezbednosti_i_nacin_zastite(int izvestaj_bezbednosti_i_nacin_zastite) {
        this.izvestaj_bezbednosti_i_nacin_zastite = izvestaj_bezbednosti_i_nacin_zastite;
    }

    public int getObavestenje_o_udesu() {
        return obavestenje_o_udesu;
    }

    public void setObavestenje_o_udesu(int obavestenje_o_udesu) {
        this.obavestenje_o_udesu = obavestenje_o_udesu;
    }
}
