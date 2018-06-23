package com.example.choinapatryk.pgm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Start;
    private Button High_Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Start = (Button) findViewById(R.id.Start);
        High_Score = (Button) findViewById(R.id.High_Score);

        Start.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
              Intent intent = new Intent(v.getContext(), game.class);
              v.getContext().startActivity(intent);
            }
        });

        High_Score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), High_Score.class);
                v.getContext().startActivity(intent);
            }
        });
    }
}
