package com.example.adam.medicationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public MedicationList medications = new MedicationList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void newMessage(View view){
        startActivity(new Intent(MainActivity.this, NewMedication.class));}

    public void updateTable(){

    }
}

