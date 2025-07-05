package com.app.nhasach.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.app.nhasach.R;

public class SuccesfullyRegisteredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_succesfully_registered);

        ImageButton Reset_myImageButton = findViewById(R.id.Reset_myImageButton1);

        Reset_myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button btnback = findViewById(R.id.bntBack);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SuccesfullyRegisteredActivity.this, LoginActivity.class));
            }
        });

    }
}