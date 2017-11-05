package top.iprogram.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lilipo on 2017/11/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
