package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button) findViewById(R.id.button_askButton);

        final ImageView MagiceightBall = (ImageView) findViewById(R.id.image_8ball);

        final int[] AskArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magiceightball", "Ze button has been pushed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("magiceightball", "The number is " + number);

                MagiceightBall.setImageResource(AskArray[number]);

            }
        });



    }
}
