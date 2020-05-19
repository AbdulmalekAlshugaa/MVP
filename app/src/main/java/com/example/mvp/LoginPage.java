package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp.Helper.Data;
import com.example.mvp.Login.LoginImp;
import com.example.mvp.Login.LoginView;

public class LoginPage extends AppCompatActivity  implements  LoginView {
    private LoginImp loginImp;
    private EditText Username , password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Username = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);
        loginImp = new LoginImp(this);
        login = findViewById(R.id.LoginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data data = new Data();
                data.setUsername("Admin");
                data.setPassword("password");
                Data.getDataArraylist().add(data); // add the username and password to the arraylist
                intitLogin(Username.getText().toString(), password.getText().toString());
            }
        });
    }

    void intitLogin(String username , String password){
        loginImp.onLoginSuccessP(this, username,password);

    }
    @Override
    public void OnLoginSuccess(String OnLoginSuccess) {
        Toast.makeText(LoginPage.this, OnLoginSuccess,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(LoginPage.this,MainActivity.class);
        startActivity(intent);
        finish();


    }

    @Override
    public void OnLoginError(String ooError) {
        Toast.makeText(LoginPage.this, ooError,Toast.LENGTH_LONG).show();

    }
}
