package com.app.mediaplayer;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {
    Button showPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showPlayButton = (Button) findViewById(R.id.showPlayButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.track);

        showPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                Intent intent = new Intent(MainActivity.this, SlideShow.class);
                startActivity(intent);

            }
        });
    }


}
