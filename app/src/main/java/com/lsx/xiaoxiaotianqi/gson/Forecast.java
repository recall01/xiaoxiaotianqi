package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2018/3/13.
 */

public class Forecast {
    public String status;
    public Basic basic;
    public Update update;
    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;
}
