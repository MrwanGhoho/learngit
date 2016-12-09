package com.example.asus.homework;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment ffragment;
    private Sfragment sfragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Button buttonNext = (Button) findViewById(R.id.next);
        Button buttonLast = (Button) findViewById(R.id.last);
        buttonLast.setOnClickListener(this);
        buttonNext.setOnClickListener(this);

        setf();


    }



    public void setf() {
              ffragment = new Ffragment();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, ffragment);
        transaction.commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next:
                sfragment = new Sfragment();
                android.app.FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.frame_layout, sfragment);
                transaction.commit();


                break;
            case R.id.last:
                setf();
                break;


        }
    }
}