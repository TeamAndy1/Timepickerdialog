package com.example.raviteja.timepickerdialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ScreenZero extends AppCompatActivity {

    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_zero);

        i = (ImageView)findViewById(R.id.sil);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(ScreenZero.this,ScreenFirst.class);
                startActivity(first);
            }
        });
    }
}
