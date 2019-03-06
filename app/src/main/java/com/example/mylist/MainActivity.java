package com.example.mylist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.mylist.model.Chiens;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DogItemClickListener {

    private ArrayList<Chiens> mesChiens;
    private RecyclerView recyclerView;
    private ChienAdapter chiensAdapteur;
    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller = new Controller(this);
        controller.start();

        this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bruit_chien);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

    }

    @Override
    public void onItemClick(Chiens chien) {
        Intent photoIntent = new Intent(this, SecondActivity.class);


        //Se donner les infos du chien
        photoIntent.putExtra("CLE", chien.getUrl());

        startActivity(photoIntent);
    }

    public void showList(List<Chiens> list){
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        chiensAdapteur = new ChienAdapter(list, this);
        recyclerView.setAdapter(chiensAdapteur);
    }

    public void playSound(View view){

        mediaPlayer.start();

    }
}

