package com.example.chens.artists.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.chens.artists.R;

public class WallPaperActivity extends AppCompatActivity {
    private int count = 1;
    private ImageSwitcher switcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_paper);
        switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(WallPaperActivity.this);
            }
        });
        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCurrentImage();
            }
        });
        showCurrentImage();
    }

    private void showCurrentImage() {

        switch (count) {
            case 1:
                switcher.setImageResource(R.drawable.sodagreen_wallpaper1);
                break;
            case 2:
                switcher.setImageResource(R.drawable.sodagreen_wallpaper2);
                break;
            case 3:
                switcher.setImageResource(R.drawable.sodagreen_wallpaper3);
                count = 1;
                return;
            default:
                break;
        }
        count++;

    }
}
