package com.example.chens.artists.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chens.artists.R;

public class MainActivity extends AppCompatActivity {
    private View websiteView, facebookView;
    private Button songsButton, wallPaperbutton, mailListButton, videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songsButton = (Button) findViewById(R.id.songsButton);
        songsButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), SongActivity.class);
                startActivity(intent);
            }
        });

        wallPaperbutton = (Button) findViewById(R.id.wallPaperbutton);
        wallPaperbutton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), WallPaperActivity.class);
                startActivity(intent);
            }
        });

        mailListButton = (Button) findViewById(R.id.mailListButton);
        mailListButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), MailListActivity.class);
                startActivity(intent);
            }
        });

        videoButton = (Button) findViewById(R.id.videoButton);
        videoButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), VideoActivity.class);
                startActivity(intent);
            }
        });

        websiteView = findViewById(R.id.website);
        websiteView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), WebsiteActivity.class);
                startActivity(intent);
            }
        });

        facebookView = findViewById(R.id.facebookView);
        facebookView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), FacebookActivity.class);
                startActivity(intent);
            }
        });
    }
}
