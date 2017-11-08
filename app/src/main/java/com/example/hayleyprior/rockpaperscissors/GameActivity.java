package com.example.hayleyprior.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    private Integer newScorePlayer;
    private Integer newScoreComputer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent i = getIntent();
        Bundle extras = i.getExtras();

        if(i.hasExtra("updatedPlayerScore")) {
            newScorePlayer = extras.getInt("updatedPlayerScore");
        } else {
            newScorePlayer = 0;
        }

        if(i.hasExtra("updatedComputerScore")) {
            newScoreComputer = extras.getInt("updatedComputerScore");
        } else {
            newScoreComputer = 0;
        }

    }

    public void onRockButtonClicked(View button){
        String playerMove = "Rock";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        i.putExtra("playerScore", newScorePlayer);
        i.putExtra("computerScore", newScoreComputer);
        startActivity(i);
    }

    public void onPaperButtonClicked(View button){
        String playerMove = "Paper";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        i.putExtra("playerScore", newScorePlayer);
        i.putExtra("computerScore", newScoreComputer);
        startActivity(i);
    }

    public void onScissorsButtonClicked(View button){
        String playerMove = "Scissors";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        i.putExtra("playerScore", newScorePlayer);
        i.putExtra("computerScore", newScoreComputer);
        startActivity(i);
    }

    public void onRulesButtonClicked(View button){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}
