package com.example.allinonedice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) (findViewById(R.id.button));
        i1 = (ImageView) (findViewById(R.id.imageView));



        b1.setOnClickListener(view -> MainActivity.this.rolladice());

        b2 = (Button) (findViewById(R.id.button2));

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        b3 = (Button) (findViewById(R.id.button3));

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        b4 = (Button) (findViewById(R.id.button4));

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });


    }
    private void rolladice(){
        int dice=(int)(Math.random()*6)+1;
        Toast toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT);
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
}