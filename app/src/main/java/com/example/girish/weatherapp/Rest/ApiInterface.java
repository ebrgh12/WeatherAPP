package com.example.girish.weatherapp.Rest;
/* import com.example.girish.weatherapp.ParsingModel.WeatherEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 //* Created by Girish on 7/12/2017.


public  interface ApiInterface  {

   //http://api.wunderground.com/api/7404ab2e5432a19d/history_20170113/q/GA/Alpharetta.json
    @GET("history_20170113/q/GA/Alpharetta.json")
    Call<WeatherEntity> getWeather();



}

*/




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
    //http://api.themoviedb.org/3/movie/popular?api_key=dad78d0a6eee736a777d00c394e6f00e

   // @GET("movie/popular")
    //Call<Movie> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("history_20170113/q/GA/Alpharetta.json")
    Call<MainResponse> getWeather();

}