package com.example.adam.medicationapp;

import android.content.Intent;
import android.graphics.Color;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Time;
import java.util.Date;

public class NewMedication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_medication);
        ConstraintLayout layout = findViewById(R.id.MainLayout2);
        layout.setBackgroundColor(Color.parseColor("#4282d3"));
    }
    public void mainMessage(View view){
        startActivity(new Intent(NewMedication.this, MainActivity.class));}



    public void save(View v){

        EditText mediName = findViewById(R.id.medName);
        EditText mediDose = findViewById(R.id.medDose);
        EditText mediTime1 = findViewById(R.id.medTime1);
        EditText mediTime2 = findViewById(R.id.medTime2);
        EditText mediTime3 = findViewById(R.id.medTime3);
        EditText mediTime4 = findViewById(R.id.medTime4);
        CheckBox daily = findViewById(R.id.cbDaily);
        CheckBox weekly = findViewById(R.id.cbWeekly);


        String name =  mediName.getText().toString();
        String dose =  mediDose.getText().toString();
        String time1 =  mediTime1.getText().toString();
        String time2 =  mediTime2.getText().toString();
        String time3 =  mediTime3.getText().toString();
        String time4 =  mediTime4.getText().toString();
        boolean mediHide = false;
        boolean weeklyUse = false;

        if (daily.isChecked() && !weekly.isChecked()){weeklyUse = false;}
        else if (!daily.isChecked() && weekly.isChecked()){weeklyUse = true;}
        else if ( daily.isChecked() && weekly.isChecked()){weeklyUse = false;}
        else if ( !daily.isChecked() && !weekly.isChecked()){weeklyUse = false;}

        MainActivity runActivity = new MainActivity();
        runActivity.medications.addMedication(new Medication(name, dose, time1, time2, time3, time4, weeklyUse, mediHide));
        startActivity(new Intent(NewMedication.this, MainActivity.class));
        runActivity.updateTable();
    }


}

