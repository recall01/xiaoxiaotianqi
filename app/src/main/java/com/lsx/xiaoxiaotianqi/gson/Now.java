package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/3/12.
 */

public class Now {
    @SerializedName("cond_code")
    public String condCode;
    //cond_txt:实况天气状况代码
    @SerializedName("cond_txt")
    public String condTxt;
    //f1:体感温度，默认单位：摄氏度
    @SerializedName("fl")
    public String fl;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("vis")
    public String vis;
    @SerializedName("wind_deg")
    public String windDeg;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("wind_sc")
    public String windSc;
    @SerializedName("wind_spd")
    public String windSpd;
}
