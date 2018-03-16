package com.lsx.xiaoxiaotianqi.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/3/12.
 */

public class Basic {
    @SerializedName("cid")
    public String cityId;
    @SerializedName("location")
    public String cityName;
    @SerializedName("parent_city")
    public String parentCity;
    @SerializedName("admin_area")
    public String adminArea;
    @SerializedName("cnty")
    public String cnty;
    @SerializedName("lat")
    public String lat;
    @SerializedName("lon")
    public String lon;
    @SerializedName("tz")
    public String tz;
}
