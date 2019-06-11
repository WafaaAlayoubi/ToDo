package com.example.todo;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgHome;
    ImageView imgGrid;
    Fragment homeFragment;
    Fragment gridFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgHome = (ImageView) findViewById(R.id.home);
        imgGrid = (ImageView) findViewById(R.id.grid);

        homeFragment = new Fragment_NoTasks();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,homeFragment);
        ft.commit();

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeFragment = new Fragment_NoTasks();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment,homeFragment);
                ft.commit();
            }
        });

        imgGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridFragment = new Fragment_Grid();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment,gridFragment);
                ft.commit();
            }
        });
    }


}
