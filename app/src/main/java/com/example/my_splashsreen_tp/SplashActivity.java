package com.example.my_splashsreen_tp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SplashActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Animation topAnim;
    private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(() -> {
            Intent i=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        },SPLASH_TIME_OUT);

        welcomeText=findViewById(R.id.welcomeText);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        welcomeText.setAnimation(topAnim);
    }
}