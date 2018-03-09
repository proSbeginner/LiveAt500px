package com.example.prosb.liveat500px.activity;

import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.prosb.liveat500px.R;
import com.example.prosb.liveat500px.fragment.MainFragment;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        Contextor.getInstance().init(getApplicationContext());

        // Toast screenWidth, screenHeight
        if(Build.VERSION.SDK_INT >= 21) {

        } else {

        }

        if(savedInstanceState == null) {
            // first created
            // place fragment here
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance(123), "MainFragmentTag")
                    .commit();
        }
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        if(savedInstanceState == null) {
            //            MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.contentContainer);
            MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag("MainFragmentTag");
            mainFragment.setHelloText("Voo Hoooo");
        }
    }
}
