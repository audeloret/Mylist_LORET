package com.example.mylist.model;

import android.media.Image;

import com.example.mylist.Chiens;

import java.util.Collections;
import java.util.List;

public class Breed {

    private List<Chiens> listeChiens = Collections.emptyList();

    public List<Chiens> getListeChiens() {
        return listeChiens;
    }

    public void setListeChiens(List<Chiens> listeChiens) {
        this.listeChiens = listeChiens;
    }

/*
        private String nomChien;
        public String getNomChien() {
        return nomChien;
    }
    public void setNomChien(String nomChien) {
        this.nomChien = nomChien;
    }

        private float prix;
        public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

        private String url;
        public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
*/

}
