package com.example.mylist;


import com.example.mylist.model.Chiens;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface CatRestApi {


    @GET("dogs.json")
    Call<List<Chiens>> getListBreed();
}

