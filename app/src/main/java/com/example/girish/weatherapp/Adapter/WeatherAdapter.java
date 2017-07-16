package com.example.girish.weatherapp.Adapter;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.girish.weatherapp.Activity.MainActivity;
import com.example.girish.weatherapp.ParsingModel.newModel.MainResponse;
import com.example.girish.weatherapp.R;

import okhttp3.Response;

import static com.example.girish.weatherapp.R.id.parent;

/**
 * Created by Girish on 7/14/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    Activity activity;

    MainActivity mainActivity;



    retrofit2.Response<MainResponse> response;
    Context mContext;
    retrofit2.Response<MainResponse> mList;

    public WeatherAdapter(Activity activity, MainActivity mainActivity, retrofit2.Response<MainResponse> response) {
        mList=response;
        this.activity = activity;
        this.mainActivity = mainActivity;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_list_item, parent, false);

       //LayoutInflater inflater = LayoutInflater.from(mContext);
        //View view = inflater.inflate(R.layout.weather_list_item, parent, false);

        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        String hum;
        String temp;
        String pressure;
        hum=mList.body().getHistory().getObservations().get(position).getHum();
        temp=mList.body().getHistory().getObservations().get(position).getTempm();
        pressure=mList.body().getHistory().getObservations().get(position).getPressurem();
        // Display the  name
        holder.humTextView.setText(hum);
        holder.tempTextView.setText(temp);
        holder.tempTextView.setText(pressure);

    }

    @Override
    public int getItemCount() {

        return mList.body().getHistory().getObservations().size();
    }


    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        TextView humTextView;
        TextView tempTextView;
        TextView pressureTextView;
        public WeatherViewHolder(View itemView) {
            super(itemView);

            humTextView = (TextView) itemView.findViewById(R.id.hum_view);
            tempTextView=(TextView)itemView.findViewById(R.id.temp_View);
            pressureTextView=(TextView)itemView.findViewById(R.id.pressure_View);


        }
    }
}
