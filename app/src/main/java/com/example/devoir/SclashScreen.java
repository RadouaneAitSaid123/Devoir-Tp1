package com.example.devoir;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SclashScreen extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sclash_screen);

        logo = findViewById(R.id.monLogo);

        Thread t = new Thread() {
            @Override
            public void run() {
                RotateAnimation rotateAnimation = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setDuration(5000);
                logo.setAnimation(rotateAnimation);
                Intent intent = new Intent(SclashScreen.this, MainActivity.class);
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                startActivity(intent);
                SclashScreen.this.finish();

            }
        };
        t.start();


    }
}
