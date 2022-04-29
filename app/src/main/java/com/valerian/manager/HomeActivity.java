package com.valerian.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.valerian.manager.oop.querier.ClientQuerierActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.home_button_client).setOnClickListener(
                (View clientButton)->startActivity(new Intent(getApplicationContext(), ClientQuerierActivity.class))
        );
    }
}