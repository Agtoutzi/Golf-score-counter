package com.example.android.golfscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score1=0,score2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScores(View v){
        score1=0;
        score2=0;
        displayScore1(score1);
        displayScore2(score2);
    }

    public void scoredCondor(View v){
        score1-=4;
        displayScore1(score1);
    }

    public void scoredAlbatross(View v){
        score1-=3;
        displayScore1(score1);
    }

    public void scoredEagle(View v){
        score1-=2;
        displayScore1(score1);
    }

    public void scoredBirdie(View v){
        score1-=1;
        displayScore1(score1);
    }

    public void scoredBogey(View v){
        score1+=1;
        displayScore1(score1);
    }

    public void scored2Bogey(View v){
        score1+=2;
        displayScore1(score1);
    }

    public void scored3Bogey(View v){
        score1+=3;
        displayScore1(score1);
    }

    public void failedToScore(View v){
        score1+=4;
        displayScore1(score1);
    }

    public void displayScore1(int score){
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(score));
    }

    public void scoredCondor2(View v){
        score2-=4;
        displayScore2(score2);
    }

    public void scoredAlbatross2(View v){
        score2-=3;
        displayScore2(score2);
    }

    public void scoredEagle2(View v){
        score2-=2;
        displayScore2(score2);
    }

    public void scoredBirdie2(View v){
        score2-=1;
        displayScore2(score2);
    }

    public void scoredBogey2(View v){
        score2+=1;
        displayScore2(score2);
    }

    public void scored2Bogey2(View v){
        score2+=2;
        displayScore2(score2);
    }

    public void scored3Bogey2(View v){
        score2+=3;
        displayScore2(score2);
    }

    public void failedToScore2(View v){
        score2+=4;
        displayScore2(score2);
    }

    public void displayScore2(int score){
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score));
    }

}
