package com.example.scratch_admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class Dashboard extends AppCompatActivity {

    LinearLayout requestsPad;
    MaterialCardView requestsDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        requestsPad = (LinearLayout) findViewById(R.id.requestsPad);
        requestsDot = (MaterialCardView) findViewById(R.id.requestsDot);

        requestsPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, LogIn.class);
                startActivity(i);
            }
        });
    }
}