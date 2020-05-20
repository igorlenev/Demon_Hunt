package com.example.demonhunt;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Music {
    private boolean isSoundOn;
    private MediaPlayer mediaPlayer;

    public boolean isSoundOn() {
        return isSoundOn;
    }

    public void setSoundOn(boolean soundOn) {
        isSoundOn = soundOn;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public Music(boolean isSoundOn) {
        this.isSoundOn = isSoundOn;
    }

    public void play(){
        mediaPlayer.start();
    }
    public void pause(){
        mediaPlayer.pause();
    }
    public void stop(){
        mediaPlayer.stop();
    }

    public void mediaPlayerCreate(Context context, int musicID){
        mediaPlayer = MediaPlayer.create(context, musicID);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
    }

    public void musicStateChange(TextView musicInstance){
        if (isSoundOn){
            isSoundOn = false;
            pause();
            musicInstance.setText(R.string.music_is_off);
        }
        else {
            isSoundOn = true;
            play();
            musicInstance.setText(R.string.music_is_on);
        }
    }
}