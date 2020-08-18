package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.color.holo_blue_light;

public class MainActivity extends AppCompatActivity {


    private View windowview;
    private Button buttonChange;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN, Color.BLUE, Color.GRAY,Color.RED,
                Color.MAGENTA,Color.YELLOW,Color.GREEN, Color.LTGRAY,Color.DKGRAY};

        windowview = findViewById(R.id.layout);
        windowview.setBackgroundColor(colors[2]);

        buttonChange = (Button) findViewById(R.id.buttonChange);
        buttonChange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                int length = colors.length;
                Random random = new Random();
                int randNum = random.nextInt(length);
                windowview.setBackgroundColor(colors[randNum]);

                Log.d("RANDOM", String.valueOf(randNum));
            }
        });
    }
}