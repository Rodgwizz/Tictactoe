package com.rodgwizz.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.RadioButton;
=======
>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
    RadioGroup radioGroup_player, radioGroup_level, radioGroup_side;
    RadioButton radioButtonOnePlayer, radioButtonTwoPlayer, radioButton_easy, radioButton_hard, radioButton_x, radioButton_o;
    Button button_play;
=======
    Button b1, b2, play;
    RadioGroup twoRB, threeRB;
    //SharedPreferences sharedPrefs;
    //boolean singleSelected = true;
    //boolean isChecked = true;
>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        radioGroup_player = findViewById(R.id.radioGroup_player);
        radioGroup_level = findViewById(R.id.radioGroup_level);
        radioGroup_side = findViewById(R.id.radioGroup_side);

        radioButtonOnePlayer = findViewById(R.id.radioButtonOnePlayer);
        radioButtonTwoPlayer = findViewById(R.id.radioButtonTwoPlayers);
        radioButton_easy = findViewById(R.id.radioButton_easy);
        radioButton_hard = findViewById(R.id.radioButton_hard);
        radioButton_x = findViewById(R.id.radioButton_x);
        radioButton_o = findViewById(R.id.radioButton_o);

        button_play = findViewById(R.id.button_play);


        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRBIdPlayer = radioGroup_player.getCheckedRadioButtonId();
                int selectedRBIdLevel = radioGroup_level.getCheckedRadioButtonId();
                int selectedRBIdSide = radioGroup_side.getCheckedRadioButtonId();

                Intent intent = new Intent(MainActivity.this, FiveBoard.class);

                if (selectedRBIdPlayer == radioButtonOnePlayer.getId()) {
                    intent.putExtra("isSinglePlayer", true);
                } else if (selectedRBIdPlayer == radioButtonTwoPlayer.getId()) {
                    intent.putExtra("isSinglePlayer", false);
                }

                if (selectedRBIdLevel == radioButton_easy.getId()) {
                    intent.putExtra("isEasy", true);
                } else if (selectedRBIdLevel == radioButton_hard.getId()) {
                    intent.putExtra("isEasy", false);
                }

                if (selectedRBIdSide == radioButton_x.getId()) {
                    intent.putExtra("choice", "x");
                } else if (selectedRBIdSide == radioButton_x.getId()) {
                    intent.putExtra("choice", "x");

                }

                startActivity(intent);

            }
    });

}


=======
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
>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5
}