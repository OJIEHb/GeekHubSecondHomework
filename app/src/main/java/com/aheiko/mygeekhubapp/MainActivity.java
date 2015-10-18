package com.aheiko.mygeekhubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aheiko.mygeekhubapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnFirst = (Button) findViewById(R.id.button3);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment mainFragment = new FirstFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_main, mainFragment).addToBackStack(null).commit();
            }
        });


        final Button btnSecond = (Button) findViewById(R.id.button4);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment mainFragment = new SecondFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_main, mainFragment).addToBackStack(null).commit();
            }
        });


    }

}
