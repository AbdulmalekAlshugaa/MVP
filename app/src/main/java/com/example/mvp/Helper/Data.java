package com.example.mvp.Helper;

import java.util.ArrayList;

public class Data {
    private String Username, password;
    private static ArrayList<Data> DataArraylist = new ArrayList<>();

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<Data> getDataArraylist() {
        return DataArraylist;
    }

    public static void setDataArraylist(ArrayList<Data> dataArraylist) {
        DataArraylist = dataArraylist;
    }
}
