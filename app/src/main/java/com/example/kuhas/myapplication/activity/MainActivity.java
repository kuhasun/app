package com.example.kuhas.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.kuhas.myapplication.R;
import com.example.kuhas.myapplication.model.model;
import com.example.kuhas.myapplication.rest.PostInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2/jsonphp/reportNew_v_2.php/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostInterface apiService = retrofit.create(PostInterface.class);
        Call<List<model>> apiCall = apiService.getPost();
        apiCall.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {
                Log.i("Success","Success :" +response.body().get(1).getVdo_title());
            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {
                Log.i("Fail","Fail"+t.toString());

            }
        });
    }
}
