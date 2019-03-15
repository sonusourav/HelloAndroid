package com.iitdh.sonusourav.helloandroid.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.iitdh.sonusourav.helloandroid.R;

public class LoginActivity extends AppCompatActivity {


  private EditText usernameField ;
  private EditText passwordField ;

  @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

     usernameField = findViewById(R.id.username);
     passwordField = findViewById(R.id.login_password);
     Button loginButton = findViewById(R.id.login);


    loginButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        String loginUserName=usernameField.getText().toString();
        String loginPassword=passwordField.getText().toString();

        if(verify(loginUserName,loginPassword)){

          if(loginUserName.equals("iitdharwad") && loginPassword.equals("pass@123")){

            Intent intent=new Intent(LoginActivity.this,WelcomeActivity.class);
            intent.putExtra("username",loginUserName);
            startActivity(intent);
            finish();

          }
          else{
            Toast.makeText(getApplicationContext(),"Enter correct credentials",Toast.LENGTH_SHORT).show();
          }
        }
      }
    });


  }

  public boolean verify(String uName, String uPass) {
    if (uName.isEmpty()) {
      Toast.makeText(getApplicationContext(), "Enter your username", Toast.LENGTH_SHORT).show();
      return false;
    }
    if (uPass.isEmpty() ){
      Toast.makeText(getApplicationContext(), "Enter your password", Toast.LENGTH_SHORT).show();
      return false;
    }
    return true;
  }
}
