package com.moucan.customretrofit.api;



import com.moucan.customretrofit.retrofit.annotation.Field;
import com.moucan.customretrofit.retrofit.annotation.GET;
import com.moucan.customretrofit.retrofit.annotation.POST;
import com.moucan.customretrofit.retrofit.annotation.Query;

import okhttp3.Call;

public interface CustomApi {

    @POST("/v3/weather/weatherInfo")
    Call postWeather(@Field("city") String city, @Field("key") String key);


    @GET("/v3/weather/weatherInfo")
    Call getWeather(@Query("city") String city, @Query("key") String key);
}
