package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2018/3/12.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public Update update;
    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;
    @SerializedName("hourly")
    public List<Hourly> hourlyList;
    @SerializedName("lifestyle")
    public List<Lifestyle> lifeStyleList;
}
