package com.rodgwizz.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, play;
    RadioGroup twoRB, threeRB;
    //SharedPreferences sharedPrefs;
    //boolean singleSelected = true;
    //boolean isChecked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        play = findViewById(R.id.play);
        //twoRB = (RadioButton) findViewById(R.id.twoRB);
        // twoRB.setChecked(true);
        // threeRB = (RadioButton) findViewById(R.id.threeRB);
        play.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent;
                        intent = new Intent(MainActivity.this, ThreeBoard.class);
                        startActivity(intent);
                    }
                }
        );
        //} else {
        //  Intent intent;
        //  intent = new Intent(MainActivity.this, FiveBoard.class);
        //  startActivity(intent);
    }
}