package com.example.mylist;

import android.util.Log;

import java.util.List;


import com.example.mylist.model.Breed;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Controller {


    static final String BASE_URL = "https://api.thecatapi.com/v1/";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        CatRestApi catRestApi = retrofit.create(CatRestApi.class);

        Call<List<Breed>> call = catRestApi.getListBreed();

        call.enqueue(new Callback<List<Breed>>() {

            @Override
            public void onResponse(Call<List<Breed>> call, Response<List<Breed>> response) {
                List<Breed> listBreed = response.body();
            }

            @Override
            public void onFailure(Call<List<Breed>> call, Throwable t) {
                Log.d("ERROR", "Api Error");

            }
        });



    }


}
