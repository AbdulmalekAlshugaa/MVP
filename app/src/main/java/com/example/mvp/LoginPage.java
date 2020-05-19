package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvp.Login.LoginImp;
import com.example.mvp.Login.LoginView;

public class LoginPage extends AppCompatActivity implements LoginView {
    private LoginImp loginImp;
    private EditText Username , password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Username = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);
    }

    @Override
    public void OnLoginSuccess(String OnLoginSuccess) {

    }

    @Override
    public void OnLoginError(String ooError) {

    }
}
