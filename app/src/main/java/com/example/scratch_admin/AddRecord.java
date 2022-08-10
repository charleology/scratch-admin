package com.example.scratch_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class AddRecord extends AppCompatActivity {

    ImageView addRecordPicIv, addRecordBackIv;
    Button saveRecordBtn;
    Chip addDogChip, addCatChip, addPuppyChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);
        getSupportActionBar().hide();

        //to adopt status bar to the pink header
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.pink));
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        addRecordBackIv = (ImageView) findViewById(R.id.addRecordBackIv);
        addRecordPicIv = (ImageView) findViewById(R.id.addRecordPicIv);
        saveRecordBtn = (Button) findViewById(R.id.saveRecordBtn);
        addDogChip = (Chip) findViewById(R.id.addDogChip);
        addCatChip = (Chip) findViewById(R.id.addCatChip);
        addPuppyChip = (Chip) findViewById(R.id.addPuppyChip);

        addDogChip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPuppyChip.setText("PUPPY");
            }
        });

        addCatChip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPuppyChip.setText("KITTEN");
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