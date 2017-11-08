package com.example.hayleyprior.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView results;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        results = findViewById(R.id.result_text);
        game = new Game();

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String playerMove = extras.getString("playerMove");
        game.setPlayerMove(playerMove);

        results.setText(game.compareMoves());
    }

    public void onPlayAgainButtonClicked(View button){
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }


}
