package com.example.allinonedice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) (findViewById(R.id.button));
        i1 = (ImageView) (findViewById(R.id.imageView));
        i2 = (ImageView) (findViewById(R.id.imageView2));



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rolladice();
                rolltwodice();
            }
        });

        b2 = (Button) (findViewById(R.id.button2));

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        b3 = (Button) (findViewById(R.id.button3));

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        b4 = (Button) (findViewById(R.id.button4));

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });


    }
    private void rolladice(){
        int dice=(int)(Math.random()*6)+1;
        Toast toast = Toast.makeText(this, "Two Dice Rolled", Toast.LENGTH_SHORT);
        toast.show();
        ImageView diceImage = (i1);
        switch(dice) {
            case 1:
                diceImage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice_6);
        }
    }
    private void rolltwodice(){
        int dice=(int)(Math.random()*6)+1;
        ImageView diceImage = (i2);
        switch(dice) {
            case 1:
                diceImage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice_6);
        }
    }
}