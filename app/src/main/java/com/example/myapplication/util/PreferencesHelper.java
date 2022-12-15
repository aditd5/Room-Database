package com.example.myapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.PublicKey;

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;


    private PreferencesHelper(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("com.example.myapplication",Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getINSTANCE(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }


    public SharedPreferences preferences() {
        return sharedPreferences;
    }

    public void setLogin(boolean isLogin){
        sharedPreferences.edit().putBoolean("isLogin", isLogin).apply();}

   // public void setUser(String user) {
      //  sharedPreferences.edit().putString("User", user).apply();}

   // public void setPassword(String password) {
     //   sharedPreferences.edit().putString("Password", password).apply();}

    public void setNama(String nama) {
        sharedPreferences.edit().putString("nama", nama).apply();}




    public Boolean islogin() {
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public String getNama() {
        return sharedPreferences.getString("nama", "JohnDoe");
    }

  //  public String user() { return sharedPreferences.getString("user","JohnDoe");}

  //  public String password() {return sharedPreferences.getString("Password","Pass");}




}
