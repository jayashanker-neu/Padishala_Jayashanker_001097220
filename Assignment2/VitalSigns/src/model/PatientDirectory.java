/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class PatientDirectory {

    ArrayList<Patient> directory;
    
    public PatientDirectory() {
        this.directory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }
    
    public Patient newPatient() {
        Patient patient = new Patient();
        directory.add(patient);
        patient.initializePerson();
        return patient;
    }
    
    public Patient newPatient(String firstName, String lastName, String dob, String houseNum, String communityName, String cityName,
            double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) {
        Patient patient = new Patient();
        directory.add(patient);
        patient.initializePerson(firstName, lastName, dob, houseNum, communityName, cityName);
        patient.newEncounter(respiratoryRate, heartRate, systolicBP, weightInKilos);
        return patient;
    }
    
    @Override
    public String toString(){
        String returnString = new String();
        int i = 0;
        for (Patient patient: directory){
            returnString += "Patient "+i+":\n";
            returnString += patient;
        }
        
        return returnString;
    }
    
}
