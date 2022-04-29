package com.valerian.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameText,passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameText = (EditText) findViewById(R.id.login_edittext_username);
        ((View)findViewById(R.id.login_button)).setOnClickListener(this::Login);
    }

    public void Login(View view){
        String username=usernameText.getText().toString();
        if(username.equals("joao"))
            startActivity(new Intent(getApplicationContext(),HomeActivity.class));
        else usernameText.setError(getString(R.string.login_failed));
    }
}