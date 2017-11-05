package top.iprogram.www.coolweather.gson;

/**
 * Created by lilipo on 2017/11/3.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
