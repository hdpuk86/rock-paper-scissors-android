package com.example.hayleyprior.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView results;
    private TextView playerScore;
    private TextView computerScore;
    private Game game;
    private Integer updatedPlayerScore;
    private Integer updatedComputerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        results = findViewById(R.id.result_text);
        playerScore = findViewById(R.id.player_score_text);
        computerScore = findViewById(R.id.computer_score_text);
        game = new Game();

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String playerMove = extras.getString("playerMove");
        Integer currentPlayerScore = extras.getInt("playerScore");
        Integer currentComputerScore = extras.getInt("computerScore");
        game.setPlayerMove(playerMove);


        results.setText(game.compareMoves());
        updatedPlayerScore = game.getPlayerScore() + currentPlayerScore;
        updatedComputerScore = game.getComputerScore() + currentComputerScore;

        playerScore.setText("Player's Score: " + updatedPlayerScore);
        computerScore.setText("Computer's Score: " + updatedComputerScore);
    }

    public void onPlayAgainButtonClicked(View button){
        Intent i = new Intent(this, GameActivity.class);
        i.putExtra("updatedPlayerScore", updatedPlayerScore);
        i.putExtra("updatedComputerScore", updatedComputerScore);
        startActivity(i);
    }


}
