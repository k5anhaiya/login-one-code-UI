package com.example.loginonecode.apiconnection;


import com.example.loginonecode.modelresponse.LoginResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceTest {
    /*
        @FormUrlEncoded
        @POST("Api.php")
        Call<> getLogin(@FieldMap HashMap<String, String> hashMap);
     */
    @FormUrlEncoded
    @POST("Api.php")
    Call<LoginResponse> login(@FieldMap HashMap<String, String> hashMap);


}


