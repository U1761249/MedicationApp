package com.example.adam.medicationapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 27/02/2018.
 */

public class MedicationList extends Medication {

 public ArrayList<Medication> getMedications() { return medications; }

 public int getLength(){return medications.size();}

 public void setMedications(ArrayList<Medication> medications) { this.medications = medications; }

 public void addMedication(Medication medication){ medications.add(medication); }

 public Medication getMedication(int index){return medications.get(index);}

 ArrayList<Medication> medications = new ArrayList<>();


}
