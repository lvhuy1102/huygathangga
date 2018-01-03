package com.example.admin.vtvplay;

import com.example.admin.vtvplay.livechanelData.Datum;
import com.example.admin.vtvplay.livechanelData.LiveChannel;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by ADMIN on 1/2/2018.
 */

public interface LiveInterface {
    @GET("v1/live-channel")
    Call<LiveChannel> getData();
}
