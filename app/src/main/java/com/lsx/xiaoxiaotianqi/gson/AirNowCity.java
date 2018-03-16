package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/3/15.
 */

public class AirNowCity {
    @SerializedName("aqi")
    public String aqi;
    @SerializedName("qlty")
    public String qlty;
    @SerializedName("main")
    public String main;
    @SerializedName("pm25")
    public String pm25;
    @SerializedName("pm10")
    public String pm10;
    @SerializedName("no2")
    public String no2;
    @SerializedName("so2")
    public String so2;
    @SerializedName("co")
    public String co;
    @SerializedName("o3")
    public String o3;
    @SerializedName("pub_time")
    public String pubTime;
}
