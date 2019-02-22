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

    /*private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String prix;

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    private Image


    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/

}
