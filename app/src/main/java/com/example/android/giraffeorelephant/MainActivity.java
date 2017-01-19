package com.example.android.giraffeorelephant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setGiraffe(View v)
    {
        ImageView imgView = (ImageView) findViewById(R.id.myImage);
        imgView.setImageResource(R.drawable.giraffe);
    }

    public void setElephant(View v)
    {
        ImageView imgView = (ImageView) findViewById(R.id.myImage);
        imgView.setImageResource(R.drawable.elephant);
    }

}
