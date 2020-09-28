package org.codeforiraq.machinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    View dropgrass, logo;
    TextView logon;



    Animation top_animation, bottom_animation, mid_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        mid_animation = AnimationUtils.loadAnimation(this, R.anim.mid_animation);

        dropgrass = findViewById(R.id.dropgrass);
        logo = findViewById(R.id.logo);

        logon = findViewById(R.id.logon);

        dropgrass.setAnimation(top_animation);
        logo.setAnimation(top_animation);
        logon.setAnimation(bottom_animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}