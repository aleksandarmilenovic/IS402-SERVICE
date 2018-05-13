package org.plu.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name="korisnici")
public class Korisnici {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private String ime;

    @NotBlank
    private String prezime;

    @NotBlank
    private  String username;

    @NotBlank
    private String password;

    @Column(nullable = false)
    private int privilegue;

    public Korisnici(String ime,String prezime,String username,String password,int privilegue) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.privilegue = privilegue;
    }

    public Korisnici(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrivilegue() {
        return privilegue;
    }

    public void setPrivilegue(int privilegue) {
        this.privilegue = privilegue;
    }
}
