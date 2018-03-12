package com.example.adam.medicationapp;
import java.sql.Time;
import java.util.ArrayList;
/**
 * Created by Adam on 27/02/2018.
 */

public class Medication {

    private String name;
    private String dosage;              //dosage in tablets or mg
    private String time1;
    private String time2;
    private String time3;
    private String time4;
    private boolean frequency;              //Daily/Weekly
    private boolean confidentiality;     //Boolean for whether the details are hidden.


    public String getName() {return name;}

    public String getDosage() {return dosage;}

    public String getTime1() {return time1;}

    public String getTime2() {return time2;}

    public String getTime3() {return time3;}

    public String getTime4() {return time4;}

    public boolean isFrequency() {return frequency;}

    public boolean isConfidentiality() {return confidentiality;}

    public Medication() {}

    public Medication(String name, String dosage, String time1, String time2, String time3, String time4, boolean frequency, boolean confidentiality) {
        this.name = name;
        this.dosage = dosage;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.time4 = time4;
        this.frequency = frequency;
        this.confidentiality = confidentiality;
    }
}
