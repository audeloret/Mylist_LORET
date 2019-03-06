package com.example.mylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylist.model.Chiens;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private ImageView imgChien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgChien = findViewById(R.id.img_chien);

        String chienJson = getIntent().getStringExtra("CLE");
        Gson gson = new Gson();
        Chiens chien = gson.fromJson(chienJson, Chiens.class);
        //Recuperer l'objet Chien
        Picasso.with(getBaseContext())
                .load(chien.getUrl())
                .into(imgChien);

    }


}
