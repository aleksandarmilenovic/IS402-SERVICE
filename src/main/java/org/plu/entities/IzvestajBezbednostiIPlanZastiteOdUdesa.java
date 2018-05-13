package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "izvestajbezbednostiiplanzastiteodudesa")
public class IzvestajBezbednostiIPlanZastiteOdUdesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private  String informacije_o_upravl_i_organizacije_u_cilju_sprecavanja;

    @Column(nullable = false)
    private int id_lokacije;

    @NotBlank
    private String opsi_sveso_postrojenja;

    @NotBlank
    private String analiza_razlika_od_hemiskog_udesa;

    @NotBlank
    private String nacin_sprecavanje_hemiskog_udesa;

    @NotBlank
    private String mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja;

    @Column(nullable = false)
    private int id_sveso_postrojenja;

    @Column(nullable = false)
    private int datum_id_tip_sveso_postrojenja;

    public IzvestajBezbednostiIPlanZastiteOdUdesa() {

    }

    public IzvestajBezbednostiIPlanZastiteOdUdesa(String informacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara, int id_lokacije, String opsi_sveso_postrojenja, String analiza_razlika_od_hemiskog_udesa, String nacin_sprecavanje_hemiskog_udesa, String mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja, int id_sveso_postrojenja, int datum_id_tip_sveso_postrojenja) {
        this.informacije_o_upravl_i_organizacije_u_cilju_sprecavanja = informacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara;
        this.id_lokacije = id_lokacije;
        this.opsi_sveso_postrojenja = opsi_sveso_postrojenja;
        this.analiza_razlika_od_hemiskog_udesa = analiza_razlika_od_hemiskog_udesa;
        this.nacin_sprecavanje_hemiskog_udesa = nacin_sprecavanje_hemiskog_udesa;
        this.mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja = mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja;
        this.id_sveso_postrojenja = id_sveso_postrojenja;
        this.datum_id_tip_sveso_postrojenja = datum_id_tip_sveso_postrojenja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInformacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara() {
        return informacije_o_upravl_i_organizacije_u_cilju_sprecavanja;
    }

    public void setInformacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara(String informacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara) {
        this.informacije_o_upravl_i_organizacije_u_cilju_sprecavanja = informacije_o_upravl_i_organizacije_u_cilju_sprecavanja_hemiskog_udara;
    }

    public int getId_lokacije() {
        return id_lokacije;
    }

    public void setId_lokacije(int id_lokacije) {
        this.id_lokacije = id_lokacije;
    }

    public String getOpsi_sveso_postrojenja() {
        return opsi_sveso_postrojenja;
    }

    public void setOpsi_sveso_postrojenja(String opsi_sveso_postrojenja) {
        this.opsi_sveso_postrojenja = opsi_sveso_postrojenja;
    }

    public String getAnaliza_razlika_od_hemiskog_udesa() {
        return analiza_razlika_od_hemiskog_udesa;
    }

    public void setAnaliza_razlika_od_hemiskog_udesa(String analiza_razlika_od_hemiskog_udesa) {
        this.analiza_razlika_od_hemiskog_udesa = analiza_razlika_od_hemiskog_udesa;
    }

    public String getNacin_sprecavanje_hemiskog_udesa() {
        return nacin_sprecavanje_hemiskog_udesa;
    }

    public void setNacin_sprecavanje_hemiskog_udesa(String nacin_sprecavanje_hemiskog_udesa) {
        this.nacin_sprecavanje_hemiskog_udesa = nacin_sprecavanje_hemiskog_udesa;
    }

    public String getMere_koje_se_preuzimaju_u_okviru_sveso_postrojenja() {
        return mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja;
    }

    public void setMere_koje_se_preuzimaju_u_okviru_sveso_postrojenja(String mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja) {
        this.mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja = mere_koje_se_preuzimaju_u_okviru_sveso_postrojenja;
    }

    public int getId_sveso_postrojenja() {
        return id_sveso_postrojenja;
    }

    public void setId_sveso_postrojenja(int id_sveso_postrojenja) {
        this.id_sveso_postrojenja = id_sveso_postrojenja;
    }

    public int getDatum_id_tip_sveso_postrojenja() {
        return datum_id_tip_sveso_postrojenja;
    }

    public void setDatum_id_tip_sveso_postrojenja(int datum_id_tip_sveso_postrojenja) {
        this.datum_id_tip_sveso_postrojenja = datum_id_tip_sveso_postrojenja;
    }
}
