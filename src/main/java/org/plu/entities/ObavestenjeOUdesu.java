package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "obavestenjeoudesu")
public class ObavestenjeOUdesu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotBlank
    private String okolnosti_vezane_za_hemiski_udes;

    @NotBlank
    private String raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa;

    @NotBlank
    private String preduzete_hitne_mere;

    @NotBlank
    private String naknadno_prikupljeni_podaci;

    @NotBlank
    private String planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa;

    @NotBlank
    private String sprecavanje_nastanka_novog_hemiskog_udesa;

    public ObavestenjeOUdesu(){}

    public ObavestenjeOUdesu(String okolnosti_vezane_za_hemiski_udes, String raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa, String preduzete_hitne_mere, String naknadno_prikupljeni_podaci, String planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa, String sprecavanje_nastanka_novog_hemiskog_udesa) {
        this.okolnosti_vezane_za_hemiski_udes = okolnosti_vezane_za_hemiski_udes;
        this.raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa = raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa;
        this.preduzete_hitne_mere = preduzete_hitne_mere;
        this.naknadno_prikupljeni_podaci = naknadno_prikupljeni_podaci;
        this.planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa = planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa;
        this.sprecavanje_nastanka_novog_hemiskog_udesa = sprecavanje_nastanka_novog_hemiskog_udesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOkolnosti_vezane_za_hemiski_udes() {
        return okolnosti_vezane_za_hemiski_udes;
    }

    public void setOkolnosti_vezane_za_hemiski_udes(String okolnosti_vezane_za_hemiski_udes) {
        this.okolnosti_vezane_za_hemiski_udes = okolnosti_vezane_za_hemiski_udes;
    }

    public String getRaspolozivi_podaci_za_procenu_posledica_hemiskog_udesa() {
        return raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa;
    }

    public void setRaspolozivi_podaci_za_procenu_posledica_hemiskog_udesa(String raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa) {
        this.raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa = raspolozivi_podaci_za_procenu_posledica_hemiskog_udesa;
    }

    public String getPreduzete_hitne_mere() {
        return preduzete_hitne_mere;
    }

    public void setPreduzete_hitne_mere(String preduzete_hitne_mere) {
        this.preduzete_hitne_mere = preduzete_hitne_mere;
    }

    public String getNaknadno_prikupljeni_podaci() {
        return naknadno_prikupljeni_podaci;
    }

    public void setNaknadno_prikupljeni_podaci(String naknadno_prikupljeni_podaci) {
        this.naknadno_prikupljeni_podaci = naknadno_prikupljeni_podaci;
    }

    public String getPlaniranje_mera_za_otklanjanje_posledica_hemiskog_udesa() {
        return planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa;
    }

    public void setPlaniranje_mera_za_otklanjanje_posledica_hemiskog_udesa(String planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa) {
        this.planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa = planiranje_mera_za_otklanjanje_posledica_hemiskog_udesa;
    }

    public String getSprecavanje_nastanka_novog_hemiskog_udesa() {
        return sprecavanje_nastanka_novog_hemiskog_udesa;
    }

    public void setSprecavanje_nastanka_novog_hemiskog_udesa(String sprecavanje_nastanka_novog_hemiskog_udesa) {
        this.sprecavanje_nastanka_novog_hemiskog_udesa = sprecavanje_nastanka_novog_hemiskog_udesa;
    }
}
