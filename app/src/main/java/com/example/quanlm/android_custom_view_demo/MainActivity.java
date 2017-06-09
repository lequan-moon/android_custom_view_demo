package com.example.quanlm.android_custom_view_demo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quanlm.android_custom_view_demo.customListView.ActCustomListView;
import com.example.quanlm.android_custom_view_demo.listMovies.ActListMovies;
import com.example.quanlm.android_custom_view_demo.simpleListView.ActSimpleListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initEvents();
    }

    private void initEvents() {
        findViewById(R.id.btnSimpleListView).setOnClickListener(this);
        findViewById(R.id.btnCustomListView).setOnClickListener(this);
        findViewById(R.id.btnMovieList).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent();

        switch (v.getId()){
            case R.id.btnSimpleListView:
                it.setClass(this, ActSimpleListView.class);
                break;
            case R.id.btnCustomListView:
                it.setClass(this, ActCustomListView.class);
                break;
            case R.id.btnMovieList:
                it.setClass(this, ActListMovies.class);
                break;

        }
        startActivity(it);
    }
}
