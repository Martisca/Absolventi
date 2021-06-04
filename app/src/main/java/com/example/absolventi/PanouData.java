package com.example.absolventi;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
public class PanouData implements Serializable{
    private int secol, deceniu, an;

    public int getSecol() {
        return secol;
    }

    public void setSecol(int secol) {
        this.secol = secol;
    }

    public int getDeceniu() {
        return deceniu;
    }

    public void setDeceniu(int deceniu) {
        this.deceniu = deceniu;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    private String clasa;
    public PanouData(int secol,int deceniu,int an,String clasa){
        this.secol=secol;
        this.deceniu=deceniu;
        this.an=an;
        this.clasa=clasa;
    }

}
