package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.R.color.holo_blue_light;

public class MainActivity extends AppCompatActivity {


    private View windowview;
    private Button buttonChange1;
    private int[] colors;
    private EditText enterMeters;
    private TextView getInches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meterstoinches);

        /**colors = new int[]{Color.CYAN, Color.BLUE, Color.GRAY,Color.RED,
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
        });**/
        windowview = findViewById(R.id.layout2);

        enterMeters = (EditText) findViewById(R.id.enterMeters);
        getInches = (TextView) findViewById(R.id.getInches);

        buttonChange1 = (Button) findViewById(R.id.buttonChange1);
        buttonChange1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //conversion logic
                double mul = 39.37;
                double result = 0.0;


                if(enterMeters.getText().toString().equals("")){

                    getInches.setText(R.string.error_message);
                    getInches.setTextColor(Color.RED);
                }
                else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue * mul;
                    getInches.setText(Double.toString(result));
                }
            }
        });

    }
}