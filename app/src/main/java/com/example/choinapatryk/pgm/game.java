package com.example.choinapatryk.pgm;

        import android.annotation.SuppressLint;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.os.CountDownTimer;
        import android.support.v7.app.AppCompatActivity;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.media.MediaPlayer;


        import java.util.Random;

public class game extends AppCompatActivity {

    public Button LA;
    public Button LB;
    public Button RA;
    public Button RB;

    public TextView LA1;
    public TextView LB1;
    public TextView RA1;
    public TextView RB1;

    public TextView LA2;
    public TextView LB2;
    public TextView RA2;
    public TextView RB2;

    public TextView LA3;
    public TextView LB3;
    public TextView RA3;
    public TextView RB3;

    public TextView LA4;
    public TextView LB4;
    public TextView RA4;
    public TextView RB4;

    public TextView LA5;
    public TextView LB5;
    public TextView RA5;
    public TextView RB5;
    public TextView CzasGry;


    public MediaPlayer mediaPlayer;

    private boolean touchstateLA;
    private boolean touchstateLB;
    private boolean touchstateRA;
    private boolean touchstateRB;

    private boolean holdstateLA;
    private boolean holdstateLB;
    private boolean holdstateRA;
    private boolean holdstateRB;

    public global glob;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);





    }

        




        @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected  void onResume(){
        super.onResume();



        LA = findViewById(R.id.LA);

        LB = findViewById(R.id.LB);

        RA = findViewById(R.id.RA);

        RB = findViewById(R.id.RB);


        LA1 = findViewById(R.id.LA1);

        LB1 = findViewById(R.id.LB1);

        RA1 = findViewById(R.id.RA1);

        RB1 = findViewById(R.id.RB1);


        LA2 = findViewById(R.id.LA2);

        LB2 = findViewById(R.id.LB2);

        RA2 = findViewById(R.id.RA2);

        RB2 = findViewById(R.id.RB2);


        LA3 = findViewById(R.id.LA3);

        LB3 = findViewById(R.id.LB3);

        RA3 = findViewById(R.id.RA3);

        RB3 = findViewById(R.id.RB3);


        LA4 = findViewById(R.id.LA4);

        LB4 = findViewById(R.id.LB4);

        RA4 = findViewById(R.id.RA4);

        RB4 = findViewById(R.id.RB4);


        LA5 = findViewById(R.id.LA5);

        LB5 = findViewById(R.id.LB5);

        RA5 = findViewById(R.id.RA5);

        RB5 = findViewById(R.id.RB5);

        CzasGry = findViewById(R.id.czas);


        mediaPlayer = MediaPlayer.create(this, R.raw.drum_100);
        Random rand = new Random();

        final global glob = new global();
        glob.endlb = false ;


        LA.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mediaPlayer.start();
                return false;
            }
        });

        LB.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mediaPlayer.start();
                return false;
            }
        });

        RA.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mediaPlayer.start();
                return false;
            }
        });

        RB.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mediaPlayer.start();
                return false;
            }
        });


        /*for(int i = 0 ; i < 5 ; i++ ){
            LB3.setBackgroundColor(100*i+10*i+i);*/


        final CountDownTimer timerla1;
        final CountDownTimer timerlb1;
        final CountDownTimer timerra1;
        final CountDownTimer timerrb1;

        final CountDownTimer timerla2;
        final CountDownTimer timerlb2;
        final CountDownTimer timerra2;
        final CountDownTimer timerrb2;

        final CountDownTimer timerla3;
        final CountDownTimer timerlb3;
        final CountDownTimer timerra3;
        final CountDownTimer timerrb3;

        final CountDownTimer timerla4;
        final CountDownTimer timerlb4;
        final CountDownTimer timerra4;
        final CountDownTimer timerrb4;

        final CountDownTimer timerla5;
        final CountDownTimer timerlb5;
        final CountDownTimer timerra5;
        final CountDownTimer timerrb5;


        timerlb5 = new CountDownTimer(500, 10) {

            public void onTick(long millisUntilFinished) {
                LB5.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));


            }
            public void onFinish() {

                LB5.setBackgroundColor(Color.BLUE);

                glob.endlb = true;
            }


        }.start();


        timerlb4 = new CountDownTimer(600, 10) {

            public void onTick(long millisUntilFinished) {
                LB4.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));
            }

            public void onFinish() {

                LB4.setBackgroundColor(Color.BLUE);

                timerlb5.start();

            }

        }.

                start();


        timerlb3 = new CountDownTimer(600, 10) {

            public void onTick(long millisUntilFinished) {
                LB3.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));
            }

            public void onFinish() {

                LB3.setBackgroundColor(Color.BLUE);

                timerlb4.start();

            }

        }.

                start();


        timerlb2 = new CountDownTimer(1500, 10) {

            public void onTick(long millisUntilFinished) {
                LB2.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));
            }

            public void onFinish() {

                LB2.setBackgroundColor(Color.BLUE);

                timerlb3.start();
            }

        }.

                start();


        timerlb1 = new CountDownTimer(3000, 10) {

            public void onTick(long millisUntilFinished) {
                LB1.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));
            }

            public void onFinish() {
                //int  lb1 = Integer.parseInt(LB1.getText().toString());

                LB1.setBackgroundColor(Color.BLUE);

                timerlb2.start();
            }

        }.start();


        CountDownTimer timergry = new CountDownTimer(30000, 10) {

            public void onTick(long millisUntilFinished) {
                CzasGry.setText(String.format("%.2f", ((float) millisUntilFinished) / 1000));
            }

            public void onFinish() {

            }

        }.start();


        timerlb1.cancel();
        timerlb2.cancel();
        timerlb3.cancel();
        timerlb4.cancel();
        timerlb5.cancel();

        timerlb1.start();

        if (glob.endlb == true) {
            timerlb1.cancel();
            timerlb1.start();
            glob.endlb = false;
        }


}
}
