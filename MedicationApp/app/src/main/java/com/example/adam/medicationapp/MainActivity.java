package com.example.adam.medicationapp;


import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity {

    public MedicationList medications = new MedicationList();
    static String[] titles = {"Name", "Dose", "Next Time"};

    ArrayList<String[]> example = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TableView<String[]> tableView = (TableView<String[]>) findViewById(R.id.table);
        String[] exampleString = {"Paracetamol", "2 Tablets", "16:00"};
        example.add(exampleString);

        //SET PROP
        ConstraintLayout layout = findViewById(R.id.mainLayout);
        layout.setBackgroundColor(Color.parseColor("#4282d3"));
        tableView.setHeaderBackgroundColor(Color.parseColor("#06799f"));
        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this,titles));

        tableView.setColumnCount(3);
        tableView.setDataAdapter(new SimpleTableDataAdapter(MainActivity.this, (List<String[]>) example));
        }

    public void newMessage(View view){
        startActivity(new Intent(MainActivity.this, NewMedication.class));}

    public void updateTable(){


        TableView table = findViewById(R.id.table);
        table.setColumnCount(3);

        table.setDataAdapter(new SimpleTableDataAdapter(MainActivity.this, (List<String[]>) example));

    }
}

