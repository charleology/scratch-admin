package com.example.scratch_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

public class ManageAccount extends AppCompatActivity {

    EditText accountSearchEt;
    ImageView accountSearchBtn, createAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_account);
        getSupportActionBar().hide();

        //to adopt status bar to the pink header
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.pink));
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        accountSearchEt = (EditText) findViewById(R.id.accountSearchEt);
        accountSearchBtn = (ImageView) findViewById(R.id.accountSearchBtn);
        createAccountBtn = (ImageView) findViewById(R.id.createAccountBtn);
    }
}