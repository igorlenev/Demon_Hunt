package com.example.demonhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    private Button musicSwitchButton;
    private boolean isSoundOn = true;
    private int musicID = R.raw.main_menu;
    private TextView musicInstance;
    private Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        musicSwitchButton = findViewById(R.id.musicSwitchButton);
        musicInstance = findViewById(R.id.musicInstance);
        music = new Music(isSoundOn);

        music.mediaPlayerCreate(this, musicID);
        music.play();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
                music.stop();
            }
        });

        musicSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.musicStateChange(musicInstance);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();

        if (music.isSoundOn()){
            music.play();
        }
    }
}