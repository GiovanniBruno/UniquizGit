package com.example.admin.uniquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private TextView bemvindo;
    private ImageView chapeu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bemvindo = (TextView) findViewById(R.id.bemvindo);
        chapeu = (ImageView) findViewById(R.id.chapeu);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transicao);
        bemvindo.startAnimation(myanim);
        chapeu.startAnimation(myanim);
        final Intent i = new Intent(this,MainActivity.class);
        Thread tempo =new Thread(){
            public void run(){
                try {
                    sleep(5000);
                } catch ( InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
            tempo.start();
    }
}
