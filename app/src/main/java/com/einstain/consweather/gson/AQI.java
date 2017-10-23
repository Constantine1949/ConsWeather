package com.einstain.consweather.gson;

/**
 * Created by Constantine on 2017/10/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
