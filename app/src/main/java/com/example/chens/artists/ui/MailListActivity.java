package com.example.chens.artists.ui;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chens.artists.R;
import com.example.chens.artists.exception.MyException;

import java.io.File;

public class MailListActivity extends AppCompatActivity {
    Button sendButton;
    TextView mailToTextView, mailFromTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_list);
        mailToTextView = (TextView) findViewById(R.id.mailTo);
        mailFromTextView = (TextView) findViewById(R.id.mailFrom);
        sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (mailValid(mailToTextView.getText().toString())|| mailValid(mailFromTextView.getText().toString())) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MailListActivity.this);
                    File dir = getFilesDir();
                    MyException e = new MyException("email invalid", builder, dir);
                    builder.show();
                }
            }
        });

    }
    private Boolean mailValid(String mail) {
        int index = mail.indexOf("@");
        if (index == -1 || index == 0 || index == mail.length() - 1) {
            return false;
        }
        return true;
    }
}
