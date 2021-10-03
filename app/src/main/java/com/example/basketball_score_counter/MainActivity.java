package com.example.basketball_score_counter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.basketball_score_counter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);//String.valueOf(score)
    }

    int finalScoreA = 0;

    public void plusThreeForA(View view) {
        finalScoreA += 3;
        displayForTeamA(finalScoreA);
    }

    public void plusTwoForA(View view) {
        finalScoreA += 2;
        displayForTeamA(finalScoreA);
    }

    public void plusOneForA(View view) {
        finalScoreA += 1;
        displayForTeamA(finalScoreA);
    }

    //For Team B

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);//String.valueOf(score)
    }

    int finalScoreB = 0;

    public void plusThreeForB(View view) {
        finalScoreB += 3;
        displayForTeamB(finalScoreB);
    }

    public void plusTwoForB(View view) {
        finalScoreB += 2;
        displayForTeamB(finalScoreB);
    }

    public void plusOneForB(View view) {
        finalScoreB += 1;
        displayForTeamB(finalScoreB);
    }

    // For Reset
    public void reset(View v){
        finalScoreA = 0;
        finalScoreB = 0;
        displayForTeamB(0);
        displayForTeamA(0);
    }
}