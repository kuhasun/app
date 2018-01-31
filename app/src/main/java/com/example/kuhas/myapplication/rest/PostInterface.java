package com.example.kuhas.myapplication.rest;

import com.example.kuhas.myapplication.model.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kuhas on 31/1/2561.
 */

public interface PostInterface {
    @GET("getReport")
    Call<List<model>> getPost();
}
