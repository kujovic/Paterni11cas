/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author stefan.kujovic
 */
public class Student {

    private String brIndeksa;
    private String ime;
    private String prezime;

    public Student() {
    }

    public Student(String brIndeksa, String ime, String prezime) {
        this.brIndeksa = brIndeksa;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
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

    @Override
    public String toString() {
        return brIndeksa + " " + ime + " " + prezime;
    }

}
