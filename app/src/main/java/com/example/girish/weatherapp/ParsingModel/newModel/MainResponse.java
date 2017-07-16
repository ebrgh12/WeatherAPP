package com.example.girish.weatherapp.ParsingModel.newModel;

import com.example.girish.weatherapp.ParsingModel.newModel.modelOne.MyResponse;
import com.example.girish.weatherapp.ParsingModel.newModel.modelTwo.MyHistory;

/**
 * Created by Girish on 7/14/2017.
 */
public class MainResponse {

    private MyResponse response;
    private MyHistory history;


    public MyResponse getResponse() {
        return response;
    }

    public void setResponse(MyResponse response) {
        this.response = response;
    }

    public MyHistory getHistory() {
        return history;
    }

    public void setHistory(MyHistory history) {
        this.history = history;
    }

}
