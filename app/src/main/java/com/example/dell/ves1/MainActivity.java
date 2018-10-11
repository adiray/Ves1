package com.example.dell.ves1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import com.example.dell.ves1.Utility.Response;
import com.example.dell.ves1.Utility.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    TextView rent, sale, land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rent = findViewById(R.id.ret_rent);
        sale = findViewById(R.id.ret_buy);
        land = findViewById(R.id.ret_land);
        final ArrayList<String> ret_search = new ArrayList<>();

        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ret_search.contains("rent")) {

                    rent.setTextColor(0x000000);
                    ret_search.remove("rent");

                } else {
                    rent.setTextColor(0xFF4081);
                    ret_search.add("rent");

                }

            }
        });

        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ret_search.contains("sale")) {

                    sale.setTextColor(0x000000);
                    ret_search.remove("sale");
                } else {
                    rent.setTextColor(0xFF4081);
                    ret_search.add("sale");
                }
            }
        });

        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ret_search.contains("land")) {

                    land.setTextColor(0x000000);
                    ret_search.remove("land");
                } else {
                    land.setTextColor(0xFF4081);
                    ret_search.add("land");
                }
            }
        });


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/54158ACA-8614-7763-FF72-3BFBF61B4600/167C910C-C110-5D40-FF09-C8621E23B700/data/")
                .addConverterFactory(GsonConverterFactory.create());

        //use your builder to build a retrofit object
        Retrofit myretrofit = builder.build();

        //create a retrofit client using the retrofit object
        RetrofitClient mywebclient = myretrofit.create(RetrofitClient.class);

        //use your web client to create your server call objects
        retrofit2.Call<ArrayList<Response>> mycall = mywebclient.getallrealestate();
        retrofit2.Call<ArrayList<Response>> myLandCall = mywebclient.getallland();
        retrofit2.Call<ArrayList<Response>> myRentCall = mywebclient.getallhousesforrent();
        retrofit2.Call<ArrayList<Response>> mysaleCall = mywebclient.getallhousesforsale();


        //make the server calls

        //the call for all real estate
        mycall.enqueue(new Callback<ArrayList<Response>>() {
            @Override
            public void onResponse(Call<ArrayList<Response>> call, retrofit2.Response<ArrayList<Response>> response) {
                ArrayList<Response> allrealestate;
                allrealestate= response.body();

      //This is where you stopped. making the call for all real estate

            }

            @Override
            public void onFailure(Call<ArrayList<Response>> call, Throwable t) {

            }
        });





    }



    //  ArrayList<Response> ResponseItems ;
    //                ResponseItems = response.body();









}