package com.example.adam.medicationapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 27/02/2018.
 */

public class MedicationList extends Medication {

 public ArrayList<Medication> getMedications() { return medications; }

 public void setPlayers(ArrayList<Medication> players) { this.medications = players; }

 public void addMedication(Medication medication){ medications.add(medication); }

 ArrayList<Medication> medications = new ArrayList<>();


}
