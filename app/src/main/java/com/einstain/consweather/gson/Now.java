package com.einstain.consweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Constantine on 2017/10/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
