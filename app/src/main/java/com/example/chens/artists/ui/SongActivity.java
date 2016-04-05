package com.example.chens.artists.ui;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chens.artists.R;

public class SongActivity extends AppCompatActivity {
    private View fistSongView, secondSongView;
    private MediaPlayer mediaPlayer;
    private int[] rawSourceID = {R.raw.song1, R.raw.song2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        fistSongView = (View) findViewById(R.id.firstSong);
        fistSongView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    AssetFileDescriptor afd;
                    afd = getResources().openRawResourceFd(rawSourceID[0]);
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                    mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    afd.close();
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        secondSongView = (View) findViewById(R.id.secondSong);
        secondSongView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    AssetFileDescriptor afd;
                    afd = getResources().openRawResourceFd(rawSourceID[1]);
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                    mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    afd.close();
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
