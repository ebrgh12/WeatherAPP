package com.example.girish.weatherapp.Rest;
import com.example.girish.weatherapp.ParsingModel.Entity;
import com.example.girish.weatherapp.ParsingModel.newModel.MainResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Girish on 7/11/2017.
 */

public interface ApiInterface {

        @GET("history_20170113/q/GA/Alpharetta.json")
    Call<MainResponse> getWeather();

}