package com.example.jesil.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    ImageView imageView2;
    TextView textView2;

    private int mimage;
    private int mImage2;
    private int mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_roll);
        imageView = findViewById(R.id.imageView_roll_1);
        textView2 = findViewById(R.id.textview_roll_2);
        imageView2 = findViewById(R.id.imageView_roll_6);


    }

    public void rollDice(View view) {
        int result = new Random().nextInt(6) + 1;
        int mResult = new Random().nextInt(6) + 1;


        switch (result) {
            case 1:
                mimage = R.drawable.dice_1;
                break;

            case 2:
                mimage = R.drawable.dice_2;
                break;

            case 3:
                mimage = R.drawable.dice_3;
                break;

            case 4:
                mimage = R.drawable.dice_4;
                break;

            case 5:
                mimage = R.drawable.dice_5;
                break;

            case 6:
                mimage = R.drawable.dice_6;
                break;

        }


        imageView.setImageResource(mimage);


        switch (mResult) {

            case 1:
                mImage2 = R.drawable.dice_1;
                break;

            case 2:
                mImage2 = R.drawable.dice_2;
                break;

            case 3:
                mImage2 = R.drawable.dice_3;
                break;

            case 4:
                mImage2 = R.drawable.dice_4;
                break;

            case 5:
                mImage2 = R.drawable.dice_5;
                break;

            case 6:
                mImage2 = R.drawable.dice_6;
                break;

        }
        imageView2.setImageResource(mImage2);
        textView.setText(String.valueOf(result));
        textView2.setText(String.valueOf(mResult));

    }

}

