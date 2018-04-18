package com.rodgwizz.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup_player, radioGroup_level, radioGroup_side;
    RadioButton radioButtonOnePlayer, radioButtonTwoPlayer, radioButton_easy, radioButton_hard, radioButton_x, radioButton_o;
    Button button_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


}