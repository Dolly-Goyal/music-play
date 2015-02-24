package com.app.mediaplayer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class SlideShow extends ActionBarActivity {
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
    static int t = 0;
    ImageView slideImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);

        slideImage = (ImageView) findViewById(R.id.slidingImages);
        slideImage.setImageResource(images[t]);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(t < 3) {
                            t++;
                            slideImage.setImageResource(images[t]);
                        }
                        else{
                            t = 0;
                            slideImage.setImageResource(images[t]);
                        }
                    }
                });

            }
        },2000,2000);
    }
}
