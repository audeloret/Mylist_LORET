package com.example.mylist.controller;

import android.util.Log;
import java.util.List;
import com.example.mylist.view.MainActivity;
import com.example.mylist.model.Chiens;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Controller {

    private MainActivity activity;

    static final String BASE_URL = "https://audeloret.github.io/";

    //activity = (MainActivity) findViewById(R.id.my_url);
    //activity = (MainActivity) getApplicationContext();

    public Controller(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        CatRestApi catRestApi = retrofit.create(CatRestApi.class);

        Call<List<Chiens>> call = catRestApi.getListBreed();

        call.enqueue(new Callback<List<Chiens>>() {

            @Override
            public void onResponse(Call<List<Chiens>> call, Response<List<Chiens>> response) {
                List<Chiens> listBreed = response.body();
                activity.showList(listBreed);
            }

            @Override
            public void onFailure(Call<List<Chiens>> call, Throwable t) {
                Log.d("ERROR", "Api Error");

            }
        });



    }


}
