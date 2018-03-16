package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/3/13.
 */

public class DailyForecast {
    @SerializedName("cond_code_d")
    public String condCodeD;
    @SerializedName("cond_code_n")
    public String condCodeN;
    @SerializedName("cond_txt_d")
    public String condTxtD;
    @SerializedName("cond_txt_n")
    public String condTxtN;
    @SerializedName("date")
    public String date;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pop")
    public String pop;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp_max")
    public String tmpMax;
    @SerializedName("tmp_min")
    public String tmpMin;
    @SerializedName("uv_index")
    public String uvIndex;
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
