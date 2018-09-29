package com.spitslide.derdasdie.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.spitslide.derdasdie.R;
import com.spitslide.derdasdie.utils.PrefsUtil;


public abstract class ThemedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (PrefsUtil.getPrefs(this, "theme")) {
            setTheme(R.style.DarkTheme);
        }
        super.onCreate(savedInstanceState);
    }



}