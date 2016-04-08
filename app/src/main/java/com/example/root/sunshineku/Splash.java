package com.example.root.sunshineku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread loading = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(Splash.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };

        loading.start();
    }
}
