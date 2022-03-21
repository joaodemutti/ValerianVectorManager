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
        ((View)findViewById(R.id.login_button)).setOnClickListener(this::Login);
        usernameText = (EditText) findViewById(R.id.login_edittext_username);

    }

    public void Login(View view){
        if(usernameText.getText().toString()=="joao")
            new Handler().postDelayed(() -> startActivity(new Intent(getApplicationContext(),HomeActivity.class)),1000);
        else usernameText.setError(getString(R.string.login_failed));
    }
}