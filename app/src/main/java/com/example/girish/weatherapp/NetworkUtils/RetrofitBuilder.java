package com.example.girish.weatherapp.NetworkUtils;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Girish on 7/11/2017.
 */

public class RetrofitBuilder {

    //public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

    public static final String BASE_URL = "http://api.wunderground.com/api/7404ab2e5432a19d/";//
    // history_20170113/q/GA/Alpharetta.json


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}


