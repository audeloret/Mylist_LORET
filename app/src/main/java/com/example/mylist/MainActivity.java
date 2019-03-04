package com.example.mylist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mylist.model.Breed;

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
    public void onItemClick(View view, int position) {
        Intent photoIntent = new Intent(this, SecondActivity.class);
        startActivity(photoIntent);
    }

    public void showList(List<Breed> list){
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

