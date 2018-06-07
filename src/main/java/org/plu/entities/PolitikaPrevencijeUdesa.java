package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "politikaprevencijeudesa")
public class PolitikaPrevencijeUdesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotBlank
    private String ciljevi;

    @NotBlank
    private String prinvipi_delovanja;

    @Column(unique = false)
    private long datum;

    public PolitikaPrevencijeUdesa(){}

    public PolitikaPrevencijeUdesa(String ciljevi, String prinvipi_delovanja, long datum) {
        this.ciljevi = ciljevi;
        this.prinvipi_delovanja = prinvipi_delovanja;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiljevi() {
        return ciljevi;
    }

    public void setCiljevi(String ciljevi) {
        this.ciljevi = ciljevi;
    }

    public String getPrinvipi_delovanja() {
        return prinvipi_delovanja;
    }

    public void setPrinvipi_delovanja(String prinvipi_delovanja) {
        this.prinvipi_delovanja = prinvipi_delovanja;
    }

    public long getDatum() {
        return datum;
    }

    public void setDatum(long datum) {
        this.datum = datum;
    }
}
