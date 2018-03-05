package com.example.zmd.zmdweather.gson;

/**
 * Created by Lenovo on 2018/3/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
