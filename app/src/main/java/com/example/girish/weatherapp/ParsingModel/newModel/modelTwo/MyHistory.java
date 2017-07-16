package com.example.girish.weatherapp.ParsingModel.newModel.modelTwo;

import com.example.girish.weatherapp.ParsingModel.newModel.modelTwo.history.MyDate;
import com.example.girish.weatherapp.ParsingModel.newModel.modelTwo.history.MyObservation;
import com.example.girish.weatherapp.ParsingModel.newModel.modelTwo.history.MyUtcdate;

import java.util.List;

/**
 * Created by Girish on 7/14/2017.
 */

public class MyHistory {

    private MyDate date;
    private MyUtcdate utcdate;
    private List<MyObservation> observations = null;

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public MyUtcdate getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(MyUtcdate utcdate) {
        this.utcdate = utcdate;
    }

    public List<MyObservation> getObservations() {
        return observations;
    }

    public void setObservations(List<MyObservation> observations) {
        this.observations = observations;
    }
}
