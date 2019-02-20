package com.example.mylist;


import com.example.mylist.model.Breed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface CatRestApi {


    @Headers("x-api-key: DEMO-API-KEY")
    @GET("breeds")
    Call<List<Breed>> getListBreed();
}

