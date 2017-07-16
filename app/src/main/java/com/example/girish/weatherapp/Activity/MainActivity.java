package com.example.girish.weatherapp.Activity;

import android.content.Context;
import android.graphics.Movie;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.girish.weatherapp.Adapter.WeatherAdapter;
import com.example.girish.weatherapp.Constants.API_CONSTANTS;
import com.example.girish.weatherapp.NetworkUtils.RetrofitBuilder;
import com.example.girish.weatherapp.ParsingModel.Entity;
import com.example.girish.weatherapp.ParsingModel.WeatherEntity;
import com.example.girish.weatherapp.ParsingModel.newModel.MainResponse;
import com.example.girish.weatherapp.R;
import com.example.girish.weatherapp.Rest.ApiInterface;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private WeatherAdapter mAdapter;
    Context context;
    SwipeRefreshLayout swipeContainer;
    private final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       makeRetromovieSearch();
        Toast.makeText(MainActivity.this, "Starting search",Toast.LENGTH_LONG ).show();
        SwipeRefreshLayout swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swiperefresh_id);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(MainActivity.this, "Reloading data",Toast.LENGTH_LONG ).show();
                makeRetromovieSearch();
            }
        });
    }
    public void makeRetromovieSearch(){

            Retrofit retrofit= RetrofitBuilder.getClient();
            ApiInterface service= retrofit.create(ApiInterface.class);

            Call<MainResponse> call=service.getWeather();
            call.enqueue(new Callback<MainResponse>() {
                @Override
                public void onResponse(Call<MainResponse> call, Response<MainResponse> response) {
                    Toast.makeText(MainActivity.this, "retrofit sucess",Toast.LENGTH_LONG ).show();
                    mAdapter= new WeatherAdapter(MainActivity.this,MainActivity.this,response); // changed from this to context
                    RecyclerView waitlistRecyclerView;
                    // Set local attributes to corresponding views
                    waitlistRecyclerView = (RecyclerView) findViewById(R.id.all_weather_list_view);
                    // Set layout for the RecyclerView, because it's a list we are using the linear layout
                    // changed from this to  context
                    waitlistRecyclerView.setLayoutManager(new LinearLayoutManager(context));
                    // Link the adapter to the RecyclerView
                    waitlistRecyclerView.setAdapter(mAdapter);
                }
                @Override
                public void onFailure(Call<MainResponse> call, Throwable t) {

                    Log.v(TAG," On Response failure "+t.toString());
                }
            });

        }

     }
