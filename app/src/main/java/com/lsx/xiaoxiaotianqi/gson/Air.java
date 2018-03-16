package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2018/3/15.
 */

public class Air {
    public String status;
    public Basic basic;
    @SerializedName("air_now_city")
    public AirNowCity airNowCity;
    @SerializedName("air_now_station")
    public List<AirNowStation> airNowStationList;
    public Update update;
}
