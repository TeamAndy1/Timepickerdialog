package com.example.raviteja.timepickerdialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class ScreenFirst extends AppCompatActivity {

    Button set_time;
    static final int DIALOG_ID=0;
    int hour_x;
    int minute_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_first);
        showTimePickerDialog();
    }


    public final void showTimePickerDialog ()
    {
        set_time = (Button)findViewById(R.id.time);
        set_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id == DIALOG_ID)
            return new TimePickerDialog(ScreenFirst.this,TimePickerListener, hour_x, minute_x,false);
        return null;
    }

    protected TimePickerDialog.OnTimeSetListener TimePickerListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hour_x = hourOfDay;
            minute_x = minute;
            Toast.makeText(ScreenFirst.this,hour_x+":"+minute_x,Toast.LENGTH_LONG).show();
        }
    };

}
