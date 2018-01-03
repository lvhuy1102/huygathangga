package com.example.admin.vtvplay;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.admin.vtvplay.livechanelData.Datum;
import com.example.admin.vtvplay.livechanelData.LiveChannel;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class Main_Activity extends AppCompatActivity {
    private RecyclerView rccView;
    private LinearLayout linearLayout;
    private ArrayList<Datum> datumArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rccView = findViewById(R.id.rccView);
        linearLayout = findViewById(R.id.lnLayout);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://apiv2.vtvplay.vn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        LiveInterface liveInterface = retrofit.create(LiveInterface.class);
        liveInterface.getData().enqueue(new Callback<LiveChannel>() {
            @Override
            public void onResponse(Response<LiveChannel> response, Retrofit retrofit) {
                Log.e("TAG", response.body().getData().get(0).getName());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                rccView.setLayoutManager(linearLayoutManager);
                rccView.setHasFixedSize(true);
                datumArrayList = new ArrayList<>(response.body().getData());
                Adapter adapter = new Adapter(datumArrayList, getApplicationContext());
                rccView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
