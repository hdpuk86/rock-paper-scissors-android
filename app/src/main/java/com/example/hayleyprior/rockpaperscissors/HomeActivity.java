package com.example.hayleyprior.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
    }

    public void onPlayButtonClicked(View button){
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }
}
