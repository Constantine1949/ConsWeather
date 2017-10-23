package com.einstain.consweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Constantine on 2017/10/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
