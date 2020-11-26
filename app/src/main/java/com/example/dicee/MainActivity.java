package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    ImageView leftDices, rightDices;
    int[] ImageForDices = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.Roll_Button_ID);
        leftDices = findViewById(R.id.Dices_Left_Image_ID);
        rightDices = findViewById(R.id.Dices_Right_Image_ID);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int num = randomNumber.nextInt(6);
                leftDices.setImageResource(ImageForDices[num]);
                int num2 = randomNumber.nextInt(6);
                rightDices.setImageResource(ImageForDices[num2]);
                if (num == num2) {
                    Toast.makeText(MainActivity.this, "You Won 10,000 Tk", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}