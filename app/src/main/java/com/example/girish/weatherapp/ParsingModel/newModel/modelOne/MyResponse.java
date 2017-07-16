package com.example.girish.weatherapp.ParsingModel.newModel.modelOne;

import com.example.girish.weatherapp.ParsingModel.newModel.modelOne.feature.MyFeatures;

/**
 * Created by Girish on 7/14/2017.
 */

public class MyResponse {

    private String version;
    private String termsofService;
    private MyFeatures features;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    public MyFeatures getFeatures() {
        return features;
    }

    public void setFeatures(MyFeatures features) {
        this.features = features;
    }
}
