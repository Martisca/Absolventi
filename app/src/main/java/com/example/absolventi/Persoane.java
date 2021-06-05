package com.example.absolventi;

public class Persoane {

    private String adresa;
    private String statut;
    private String numele;
    private String classy;
    private Long year;

    public Persoane(){
    }

    public Persoane(String classy, String numele, String statut, String adresa, Long year) {
        this.classy = classy;
        this.numele = numele;
        this.statut = statut;
        this.adresa = adresa;
        this.year = year;
    }

    public String getClassy() {
        return classy;
    }

    public void setClassy(String classy) {
        this.classy = classy;
    }

    public String getNumele() {
        return numele;
    }

    public void setNumele(String numele) {
        this.numele = numele;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
