package com.example.mylist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.example.mylist.model.Chiens;
import com.google.gson.Gson;
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

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bruit_chien);


    }

    @Override
    public void onItemClick(Chiens chien) {
        Intent photoIntent = new Intent(this, SecondActivity.class);


        //Se donner les infos du chien
        Gson gson = new Gson();
        String chienJson = gson.toJson(chien);

        photoIntent.putExtra("CLE", chienJson);

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

//06.27.57.45.15
