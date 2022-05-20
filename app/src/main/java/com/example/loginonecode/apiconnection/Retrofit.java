package com.example.loginonecode.apiconnection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static retrofit2.Retrofit retrofit = null;

    private static  String url="http://tpfnorth.com/sampark/";

    public static retrofit2.Retrofit getClientCI() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient apiClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(120, TimeUnit.SECONDS)
                .connectTimeout(120, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)
                .build();


        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory( GsonConverterFactory.create(gson))
                .client(apiClient)
                .build();

        return retrofit;
    }

}
