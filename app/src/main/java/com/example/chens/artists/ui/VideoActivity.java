package com.example.chens.artists.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.chens.artists.R;

public class VideoActivity extends AppCompatActivity {
    private View firstMVView, secondMVView;
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = (VideoView) findViewById(R.id.videoView);
        firstMVView = (View) findViewById(R.id.firstMV);
        firstMVView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaController mc = new MediaController(VideoActivity.this);
                videoView.setMediaController(mc);
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video1);
                videoView.requestFocus();
                videoView.start();
            }
        });

        secondMVView = (View) findViewById(R.id.secondMV);
        secondMVView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaController mc = new MediaController(VideoActivity.this);
                videoView.setMediaController(mc);
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video2);
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
