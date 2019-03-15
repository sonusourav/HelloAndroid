package com.iitdh.sonusourav.helloandroid.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.iitdh.sonusourav.helloandroid.R;

public class WelcomeActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);

    Intent welcomeIntent =getIntent();
    String intentUserName=welcomeIntent.getStringExtra("username");

    TextView userNameTextView=findViewById(R.id.welcome_username);
    userNameTextView.setText(intentUserName);
  }
}
