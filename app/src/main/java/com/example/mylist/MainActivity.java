package com.example.mylist;

import android.content.Intent;
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

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mesChiens = new ArrayList<>();
        mesChiens.add(new Chiens("Azawakh", 1500F));
        mesChiens.add(new Chiens("Braque de Weimar", 750.00F));
        mesChiens.add(new Chiens("Caniche Royal", 1000F));
        mesChiens.add(new Chiens("Dalmatien", 900F));
        mesChiens.add(new Chiens("Fox Terrier", 850.00F));
        mesChiens.add(new Chiens("Golden Retriever", 1000F));
        mesChiens.add(new Chiens("Husky Sibérien", 1150F));
        mesChiens.add(new Chiens("Jack Russel", 1000F));
        mesChiens.add(new Chiens("Labrador", 800F));
        mesChiens.add(new Chiens("Pomsky", 2900F));
        mesChiens.add(new Chiens("Russkiy Toy", 2000F));
        mesChiens.add(new Chiens("Saluki", 950F));
        mesChiens.add(new Chiens("Teckel", 1150F));


        chiensAdapteur = new ChienAdapter(mesChiens, this);
        recyclerView.setAdapter(chiensAdapteur);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent photoIntent = new Intent(this, SecondActivity.class);
        startActivity(photoIntent);
    }
}



