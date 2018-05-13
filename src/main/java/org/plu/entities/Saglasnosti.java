package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "saglasnotsi")
public class Saglasnosti {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(nullable = false)
    private  int id_izvestaja_i_plan_zastite_od_udesa;

    @Column(nullable = false)
    private int status;

    @NotBlank
    private String zamerka;

    @NotBlank
    private  String resenje_kojim_se_zabranjuje_rad;

    public Saglasnosti(){}

    public Saglasnosti(int id_izvestaja_i_plan_zastite_od_udesa, int status, String zamerka, String resenje_kojim_se_zabranjuje_rad) {
        this.id_izvestaja_i_plan_zastite_od_udesa = id_izvestaja_i_plan_zastite_od_udesa;
        this.status = status;
        this.zamerka = zamerka;
        this.resenje_kojim_se_zabranjuje_rad = resenje_kojim_se_zabranjuje_rad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_izvestaja_i_plan_zastite_od_udesa() {
        return id_izvestaja_i_plan_zastite_od_udesa;
    }

    public void setId_izvestaja_i_plan_zastite_od_udesa(int id_izvestaja_i_plan_zastite_od_udesa) {
        this.id_izvestaja_i_plan_zastite_od_udesa = id_izvestaja_i_plan_zastite_od_udesa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getZamerka() {
        return zamerka;
    }

    public void setZamerka(String zamerka) {
        this.zamerka = zamerka;
    }

    public String getResenje_kojim_se_zabranjuje_rad() {
        return resenje_kojim_se_zabranjuje_rad;
    }

    public void setResenje_kojim_se_zabranjuje_rad(String resenje_kojim_se_zabranjuje_rad) {
        this.resenje_kojim_se_zabranjuje_rad = resenje_kojim_se_zabranjuje_rad;
    }
}
