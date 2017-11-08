package com.example.hayleyprior.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onRockButtonClicked(View button){
        String playerMove = "Rock";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        startActivity(i);
    }

    public void onPaperButtonClicked(View button){
        String playerMove = "Paper";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        startActivity(i);
    }

    public void onScissorsButtonClicked(View button){
        String playerMove = "Scissors";

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("playerMove", playerMove);
        startActivity(i);
    }

    public void onRulesButtonClicked(View button){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}
