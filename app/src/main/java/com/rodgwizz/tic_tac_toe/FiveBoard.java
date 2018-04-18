package com.rodgwizz.tic_tac_toe;

<<<<<<< HEAD
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class FiveBoard extends AppCompatActivity {
    Button button_00;
    Button button_01;
    Button button_02;
    Button button_03;
    Button button_04;
    Button button_05;
    Button button_06;
    Button button_07;
    Button button_08;
    Button button_09;
    Button button_10;
    Button button_11;
    Button button_12;
    Button button_13;
    Button button_14;
    Button button_15;
    Button button_16;
    Button button_17;
    Button button_18;
    Button button_19;
    Button button_20;
    Button button_21;
    Button button_22;
    Button button_23;
    Button button_24;
    Button buttonReset;

    String message;
    boolean isSinglePlayer;
    boolean isPlayerX = true;
    List<Integer> buttonsAvailable;
    List<Integer> removedButtons;
    List<Integer> playerXSelections;
    List<Integer> playerOSelections;
    String choice;
    String computerChoice;
    int moves = 0;
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FiveBoard extends AppCompatActivity implements View.OnClickListener{
    private Button[][] buttons = new Button[5][5];
    private boolean player1Turn = true;
    private int roundCount;
    private int player1Points;
    private int player2Points;
    private TextView textViewPlayer1;
    private TextView textViewPlayer2;

>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiveboard);

<<<<<<< HEAD
       
        buttonReset = findViewById(R.id.reset);
        button_00 = findViewById(R.id.button_00);
        button_00.setOnClickListener(buttonClickListener);
        button_01 = findViewById(R.id.button_01);
        button_01.setOnClickListener(buttonClickListener);
        button_02 = findViewById(R.id.button_02);
        button_02.setOnClickListener(buttonClickListener);
        button_03 = findViewById(R.id.button_03);
        button_03.setOnClickListener(buttonClickListener);
        button_04 = findViewById(R.id.button_04);
        button_04.setOnClickListener(buttonClickListener);
        button_05 = findViewById(R.id.button_05);
        button_05.setOnClickListener(buttonClickListener);
        button_06 = findViewById(R.id.button_06);
        button_06.setOnClickListener(buttonClickListener);
        button_07 = findViewById(R.id.button_07);
        button_07.setOnClickListener(buttonClickListener);
        button_08 = findViewById(R.id.button_08);
        button_08.setOnClickListener(buttonClickListener);
        button_09 = findViewById(R.id.button_09);
        button_09.setOnClickListener(buttonClickListener);
        button_10 = findViewById(R.id.button_10);
        button_10.setOnClickListener(buttonClickListener);
        button_11 = findViewById(R.id.button_11);
        button_11.setOnClickListener(buttonClickListener);
        button_12 = findViewById(R.id.button_12);
        button_12.setOnClickListener(buttonClickListener);
        button_13 = findViewById(R.id.button_13);
        button_13.setOnClickListener(buttonClickListener);
        button_14 = findViewById(R.id.button_14);
        button_14.setOnClickListener(buttonClickListener);
        button_15 = findViewById(R.id.button_15);
        button_15.setOnClickListener(buttonClickListener);
        button_16 = findViewById(R.id.button_16);
        button_16.setOnClickListener(buttonClickListener);
        button_17 = findViewById(R.id.button_17);
        button_17.setOnClickListener(buttonClickListener);
        button_18 = findViewById(R.id.button_18);
        button_18.setOnClickListener(buttonClickListener);
        button_19 = findViewById(R.id.button_19);
        button_19.setOnClickListener(buttonClickListener);
        button_20 = findViewById(R.id.button_20);
        button_20.setOnClickListener(buttonClickListener);
        button_21 = findViewById(R.id.button_21);
        button_21.setOnClickListener(buttonClickListener);
        button_22 = findViewById(R.id.button_22);
        button_22.setOnClickListener(buttonClickListener);
        button_23 = findViewById(R.id.button_23);
        button_23.setOnClickListener(buttonClickListener);
        button_24 = findViewById(R.id.button_24);
        button_24.setOnClickListener(buttonClickListener);

        Intent intent = getIntent();

        choice = intent.getStringExtra("choice");
        isSinglePlayer = intent.getBooleanExtra("isSinglePlayer", true);
        if (choice.equals("x"))
            computerChoice = "o";
        else
            computerChoice = "x";

        Toast.makeText(FiveBoard.this, String.valueOf(choice), Toast.LENGTH_LONG).show();
        

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setUpGame();
            }
        });

        setUpGame();
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!isSinglePlayer) {
                if (isPlayerX) {
                    choice = "x";
                    isPlayerX = false;
                } else {
                    choice = "o";
                    isPlayerX = true;
                }
            }


            if (buttonsAvailable.contains(view.getId())) {
                Integer chosenIndex = buttonsAvailable.indexOf(view.getId());
                buttonsAvailable.remove(chosenIndex);
                removedButtons.add(view.getId());
                ((Button) view).setText(choice);

                makeSelection(choice, view.getId());
            } else
                Toast.makeText(FiveBoard.this, "Invalid move", Toast.LENGTH_SHORT).show();
        }
    };

    private void setUpGame() {
        moves = 0;
        buttonsAvailable = new ArrayList<>();
        removedButtons = new ArrayList<>();
        playerXSelections = new ArrayList<>();
        playerOSelections = new ArrayList<>();

        buttonsAvailable.add(button_00.getId());
        buttonsAvailable.add(button_01.getId());
        buttonsAvailable.add(button_02.getId());
        buttonsAvailable.add(button_03.getId());
        buttonsAvailable.add(button_04.getId());
        buttonsAvailable.add(button_05.getId());
        buttonsAvailable.add(button_06.getId());
        buttonsAvailable.add(button_07.getId());
        buttonsAvailable.add(button_08.getId());
        buttonsAvailable.add(button_09.getId());
        buttonsAvailable.add(button_10.getId());
        buttonsAvailable.add(button_11.getId());
        buttonsAvailable.add(button_12.getId());
        buttonsAvailable.add(button_13.getId());
        buttonsAvailable.add(button_14.getId());
        buttonsAvailable.add(button_15.getId());
        buttonsAvailable.add(button_16.getId());
        buttonsAvailable.add(button_17.getId());
        buttonsAvailable.add(button_18.getId());
        buttonsAvailable.add(button_19.getId());
        buttonsAvailable.add(button_20.getId());
        buttonsAvailable.add(button_21.getId());
        buttonsAvailable.add(button_22.getId());
        buttonsAvailable.add(button_23.getId());
        buttonsAvailable.add(button_24.getId());

        for (Integer buttonID : buttonsAvailable) {
            Button button = findViewById(buttonID);
            button.setText("");
            button.setTextSize(24);
        }
    }


    private void makeSelection(String playerChoice, Integer buttonID) {
        if (playerChoice.equals("x")) {
            playerXSelections.add(buttonID);
            if (isWin(playerXSelections)) {
                Toast.makeText(FiveBoard.this, "X wins!", Toast.LENGTH_LONG).show();
                message = "X wins!";
                showResults(message);
                setUpGame();
            } else {
                if (isSinglePlayer)
                    if (playerChoice.equals(choice))
                        computerPlay();
            }
        } else {
            playerOSelections.add(buttonID);
            if (isWin(playerOSelections)) {
                Toast.makeText(FiveBoard.this, "O wins!", Toast.LENGTH_LONG).show();
                message = "O wins!";
                showResults(message);
                setUpGame();
            } else {
                if (isSinglePlayer)
                    if (playerChoice.equals(choice))
                        computerPlay();
            }
        }

        if (++moves == 23) {
            Toast.makeText(FiveBoard.this, "Draw", Toast.LENGTH_LONG).show();
            message = "Draw";
            showResults(message);
            setUpGame();
        }
    }


    private void computerPlay() {
        Random random = new Random();
        int chosenIndex = random.nextInt(buttonsAvailable.size());
        Button chosenButton = findViewById(buttonsAvailable.get(chosenIndex));
        if (!removedButtons.contains(chosenButton.getId())) {
            chosenButton.setText(computerChoice);
            buttonsAvailable.remove(chosenIndex);
            removedButtons.add(chosenButton.getId());

            makeSelection(computerChoice, chosenButton.getId());
        } else
            computerPlay();
    }


    private boolean isWin(List<Integer> list) {
        List<Integer> win1 = Arrays.asList(R.id.button_00, R.id.button_01, R.id.button_02, R.id.button_03, R.id.button_04);
        List<Integer> win2 = Arrays.asList(R.id.button_05, R.id.button_06, R.id.button_07, R.id.button_08, R.id.button_09);
        List<Integer> win3 = Arrays.asList(R.id.button_10, R.id.button_11, R.id.button_12, R.id.button_13, R.id.button_14);
        List<Integer> win4 = Arrays.asList(R.id.button_15, R.id.button_16, R.id.button_17, R.id.button_18, R.id.button_19);
        List<Integer> win5 = Arrays.asList(R.id.button_20, R.id.button_21, R.id.button_22, R.id.button_23, R.id.button_24);
        List<Integer> win6 = Arrays.asList(R.id.button_00, R.id.button_05, R.id.button_10, R.id.button_15, R.id.button_20);
        List<Integer> win7 = Arrays.asList(R.id.button_01, R.id.button_06, R.id.button_11, R.id.button_16, R.id.button_21);
        List<Integer> win8 = Arrays.asList(R.id.button_03, R.id.button_08, R.id.button_13, R.id.button_18, R.id.button_23);
        List<Integer> win9 = Arrays.asList(R.id.button_04, R.id.button_09, R.id.button_14, R.id.button_19, R.id.button_24);
        List<Integer> win10 = Arrays.asList(R.id.button_00, R.id.button_06, R.id.button_12, R.id.button_18, R.id.button_24);
        List<Integer> win11 = Arrays.asList(R.id.button_04, R.id.button_08, R.id.button_12, R.id.button_16, R.id.button_20);


        List<List<Integer>> wins = Arrays.asList(win1, win2, win3, win4, win5, win6, win7, win8, win9, win10, win11);

        for (List<Integer> win : wins)
            if (list.containsAll(win))
                return true;
=======
        textViewPlayer1 = findViewById(R.id.player1);
        textViewPlayer2 = findViewById(R.id.player2);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String buttonID = "button_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
            }
        }

        Button buttonReset = findViewById(R.id.reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();


            }
        });
    }

    @Override
    public void onClick(View v) {
        if (!((Button) v).getText().toString().equals("")) {
            return;
        }

        if (player1Turn) {
            ((Button) v).setText("X");
        } else {
            ((Button) v).setText("O");
        }

        roundCount++;

        if (checkForWin()) {
            if (player1Turn) {
                player1Wins();
            } else {
                player2Wins();
            }
        } else if (roundCount == 9) {
            draw();
        } else {
            player1Turn = !player1Turn;
        }

    }

    private boolean checkForWin() {
        String[][] field = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = buttons[i][j].getText().toString();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (field[i][0].equals(field[i][1])
                    && field[i][0].equals(field[i][2])
                    && !field[i][0].equals("")) {
                return true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (field[0][i].equals(field[1][i])
                    && field[0][i].equals(field[2][i])
                    && !field[0][i].equals("")) {
                return true;
            }
        }

        if (field[0][0].equals(field[1][1])
                && field[0][0].equals(field[2][2])
                && !field[0][0].equals("")) {
            return true;
        }

        if (field[0][2].equals(field[1][1])
                && field[0][2].equals(field[2][0])
                && !field[0][2].equals("")) {
            return true;
        }
>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5

        return false;
    }

<<<<<<< HEAD
    private void showResults(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(FiveBoard.this);

        builder.setCancelable(false)
                .setMessage(String.format(Locale.ENGLISH, "Congratulations! ."+message));

        builder.setNegativeButton("Restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                dialog.cancel();
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
=======
    private void player1Wins() {
        player1Points++;
        Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();
    }

    private void player2Wins() {
        player2Points++;
        Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();
    }

    private void draw() {
        Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        resetBoard();
    }

    private void updatePointsText() {
        textViewPlayer1.setText("Player 1: " + player1Points);
        textViewPlayer2.setText("Player 2: " + player2Points);
    }

    private void resetBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[i][j].setText("");
            }
        }

        roundCount = 0;
        player1Turn = true;
    }
    private void reset() {
        player1Points = 0;
        player2Points = 0;
        updatePointsText();
        resetBoard();
    }
}
>>>>>>> 03ad92a25abbf8a011ed4f4c68a636c50e8739d5
