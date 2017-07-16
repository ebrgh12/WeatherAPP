package com.example.girish.weatherapp.ParsingModel;

import java.util.Arrays;

/**
 * Created by Girish on 7/12/2017.
 */

public class WeatherEntity {
    /*  object		{2}

	response		{3}

	history		{4}

	date		{7}

	utcdate		{7}

	observations		[72]

	dailysummary		[1]
*/
    private Result []obseravation;

    public Result[] getObseravation() {
        return obseravation;
    }

    public void setObseravation(Result[] obseravation) {
        this.obseravation = obseravation;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "obseravation=" + Arrays.toString(obseravation) +
                '}';
    }
}
