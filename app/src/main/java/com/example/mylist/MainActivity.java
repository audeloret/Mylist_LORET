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

        //this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bruit_chien);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Controller controller = new Controller();
        controller.start();
        mesChiens = new ArrayList<>();

        chiensAdapteur = new ChienAdapter(mesChiens, this);
        recyclerView.setAdapter(chiensAdapteur);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent photoIntent = new Intent(this, SecondActivity.class);
        startActivity(photoIntent);
    }


    public void playSound(View view){

        //mediaPlayer.start();

    }
}

