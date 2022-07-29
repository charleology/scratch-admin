package com.example.scratch_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.card.MaterialCardView;

public class ManageRecords extends AppCompatActivity {

    ImageView recordsBackIv;
    LinearLayout recordsAddTile, recordsCreateReportTile;
    MaterialCardView addRecordMaterial, createReportMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_records);
        getSupportActionBar().hide();

        //to adopt status bar to the pink header
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.pink));
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        recordsBackIv = (ImageView) findViewById(R.id.recordsBackIv);
        recordsAddTile = (LinearLayout) findViewById(R.id.recordsAddTile);
        recordsCreateReportTile = (LinearLayout) findViewById(R.id.recordsCreateReportTile);
        addRecordMaterial = (MaterialCardView) findViewById(R.id.addRecordMaterial);
        createReportMaterial = (MaterialCardView) findViewById(R.id.createReportMaterial);

        recordsBackIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        recordsAddTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change color of tile when pressed
                addRecordMaterial.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.lightgray)));
            }
        });

        recordsCreateReportTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change color of tile when pressed
                createReportMaterial.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.lightgray)));
            }
        });
    }

    public void back(View view){
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}