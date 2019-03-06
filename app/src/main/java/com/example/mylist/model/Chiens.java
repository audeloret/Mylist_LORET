package com.example.mylist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chiens {

    @SerializedName("name")
    @Expose
    private String nomChien;

    @SerializedName("prix")
    @Expose
    private float prix;

    @SerializedName("imageUrl")
    @Expose
    private String url;

    public Chiens(String nomChien, float prix, String url) {
        this.nomChien = nomChien;
        this.prix = prix;
        this.url = url;
    }


    public String getNomChien() {
        return String.valueOf(nomChien);
    }

    public String getPrix() {
        return String.valueOf(prix);
    }

    public String getUrl() {
        return String.valueOf(url);
    }

}

