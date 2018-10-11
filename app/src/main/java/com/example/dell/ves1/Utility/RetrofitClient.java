package com.example.dell.ves1.Utility;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitClient {

    @GET("real_estate")
    Call<ArrayList<Response>> getallrealestate();


    @GET("real_estate?where=rent%3Dtrue")
    Call<ArrayList<Response>> getallhousesforrent();

    @GET("real_estate?where=sale%3Dtrue")
    Call<ArrayList<Response>> getallhousesforsale();

    @GET("real_estate?where=land%3Dtrue")
    Call<ArrayList<Response>> getallland();



}
