package com.example.mvp.Login;

import android.app.Activity;

import com.example.mvp.Helper.Data;

public class LoginImp implements LoginView,Presenter {
    private LoginView loginView;

    public LoginImp(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void OnLoginSuccess(String OnLoginSuccess) {
        loginView.OnLoginSuccess(OnLoginSuccess);

    }

    @Override
    public void OnLoginError(String ooError) {
        loginView.OnLoginError(ooError);

    }

    @Override
    public void onLoginSuccessP(Activity activity, String Username, String password) {
        for (int i=0; i<Data.getDataArraylist().size(); i++){
            if(Data.getDataArraylist().get(i).getUsername().equals(Username) &&
                    Data.getDataArraylist().get(i).getPassword().equals(password)){

                loginView.OnLoginSuccess("Login with username"+Username);

            }else {
                loginView.OnLoginError("Error while authenticating  the user (Username or password is wrong)");
            }
        }



    }
}
