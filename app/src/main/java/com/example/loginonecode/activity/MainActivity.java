package com.example.loginonecode.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginonecode.R;
import com.example.loginonecode.apiconnection.InterfaceTest;
import com.example.loginonecode.apiconnection.Retrofit;
import com.example.loginonecode.modelresponse.LoginResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button signup, submit, forgotpassword;
    TextView chatsupport;
    EditText email, password;
    String useremail, userpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup = findViewById(R.id.sign_up);
        submit = findViewById(R.id.submit);
        forgotpassword = findViewById(R.id.forgotpassword);
        chatsupport = findViewById(R.id.chatsupport);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=findViewById(R.id.email);
                password=findViewById(R.id.password);

                useremail=email.getText().toString().trim();
                userpassword=password.getText().toString().trim();
                Log.i("useremail",":" + useremail);
                Log.i("userepassword",":" + userpassword);

                callApi(useremail,userpassword);

            }
        });

    }

    private void callApi(String useremail, String userpassword) {
        HashMap<String, String> hashMap = new HashMap<>();
        //  hashMap("key",value)

        hashMap.put("function_name","login");
        hashMap.put("Email",useremail);
        hashMap.put("Password",userpassword);



        InterfaceTest interfaceTest= Retrofit.getClientCI().create( InterfaceTest.class );
        interfaceTest.login( hashMap ).enqueue( new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Toast.makeText( MainActivity.this, "welcome teamTech:  " + response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                Toast.makeText( MainActivity.this, "welcome teamTech:  " + response.body().getError(), Toast.LENGTH_SHORT ).show();
                Toast.makeText( MainActivity.this, "welcome teamTech:  " + response.body().getStatus_code(), Toast.LENGTH_SHORT ).show();


            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

                Toast.makeText( MainActivity.this, "Try again", Toast.LENGTH_SHORT ).show();
            }
        } );



    }
}


