package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/3/14.
 */

public class Hourly {
    @SerializedName("cloud")
    public String cloud;
    @SerializedName("cond_code")
    public String condCode;
    @SerializedName("cond_txt")
    public String condTxt;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pop")
    public String pop;
    @SerializedName("pres")
    public String pres;
    @SerializedName("time")
    public String time;
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("wind_deg")
    public String windDeg;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("wind_sc")
    public String windSc;
    @SerializedName("wind_spd")
    public String windSpd;
}
