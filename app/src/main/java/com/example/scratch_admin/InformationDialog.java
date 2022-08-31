package com.example.scratch_admin;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class InformationDialog extends MaterialAlertDialogBuilder {

    public InformationDialog(@NonNull Context context){
        super(context);

        super.setView(R.layout.information_dialog);

        super.setPositiveButton(Html.fromHtml("<b>" + "EDIT" + "</b>"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //code here
            }
        });

        super.setNegativeButton(Html.fromHtml("<b>" + "CLOSE" + "</b>"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //code here
            }
        });
    }
}