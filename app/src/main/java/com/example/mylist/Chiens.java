package com.example.mylist;

import android.content.Intent;
import android.widget.Button;

public class Chiens {

    private String nomChien;
    private float prix;

    public Chiens(String nomChien, float prix) {
        this.nomChien = nomChien;
        this.prix = prix;
    }

    public String getNomChien() {
        return nomChien;
    }

    public String getPrix() {
        return String.valueOf(prix);
    }
}

