/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Scanner;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class system {
    
    static PersonDirectory personDirectory = new PersonDirectory();
    static PatientDirectory patientDirectory = new PatientDirectory();
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    showAllPeopleMenu();
                    break;
                case 2:
                    Person person = personDirectory.newPerson();
                    System.out.println("\nPerson " + person.getFullName() + " is created successfully");
                    break;
                case 3:
                    showAllPatientsMenu();
                    break;
                case 4:
                    Patient patient = patientDirectory.newPatient();
                    personDirectory.getDirectory().add(patient);
                    patient.newEncounter();
                    System.out.println("\nPatient " + patient.getFullName() + " is created successfully");
                    break;
                case 5:
                    showAllCities();
                    break;
                case 6:
                    showAllCommunities();
                    break;
                case 9:
                    return;
            }
        }while(choice != 9);
        
    }
    
    private static void showMenu(){
        System.out.println("\nChoose one of the following options:");
        System.out.println(" 1. See all people");
        System.out.println(" 2. Add Person");
        System.out.println(" 3. See all patients");
        System.out.println(" 4. Add Patient");
        System.out.println(" 5. See all Cities");
        System.out.println(" 6. See all Communities");
        System.out.println(" 9. Exit");
    }
    
    private static void showAllCities(){
        int i = 1;
        int choice;
        String selectedCity;
        Scanner scanner = new Scanner(System.in);
        for(Person person: personDirectory.getDirectory()){
            System.out.printf("%3d. %s\n",i,person.getCityName());
            i++;
        }
        System.out.println("\nChoose one of the cities to get into details\nOR type something to go back to previous menu: : ");
        try {
            choice = scanner.nextInt();
            selectedCity = personDirectory.directory.get(choice - 1).getCityName();
            showSelectedCity(selectedCity);
        }
        catch(Exception e){
            System.out.println("Going to previous menu\n");
        }
    }
    
    private static void showAllCommunities(){
        int i = 1;
        int choice;
        String selectedCommunity;
        Scanner scanner = new Scanner(System.in);
        for(Person person: personDirectory.getDirectory()){
            System.out.printf("%3d. %s\n",i,person.getCommunityName());
            i++;
        }
        System.out.println("\nChoose one of the communities to get into details\nOR type something to go back to previous menu: : ");
        try {
            choice = scanner.nextInt();
            selectedCommunity = personDirectory.directory.get(choice - 1).getCommunityName();
            showSelectedCommunity(selectedCommunity, personDirectory.directory.get(choice - 1).getCityName());
        }
        catch(Exception e){
            System.out.println("Going to previous menu\n");
        }
        
    }
    
    private static void showAllPeopleMenu(){
        
        int i = 1;
        int choice;
        if(personDirectory.getDirectory().isEmpty()) {
            System.out.println("\nNo people created yet.");
            return;
        }
            
        Person selectedPerson;
        Scanner scanner = new Scanner(System.in);
        for(Person person: personDirectory.getDirectory()){
            System.out.printf("%3d. %s\n",i,person.getFullName());
            i++;
        }
        System.out.println("\nChoose one of the person to get into details\nOR type something to go back to previous menu: ");
        try {
            choice = scanner.nextInt();
            selectedPerson = personDirectory.directory.get(choice - 1);
            showSelectedPerson(selectedPerson);
        }
        catch(Exception e){
            System.out.println("Going to previous menu\n");
        }
    }
    
    private static void showSelectedPerson(Person person){
        System.out.println(person);
        int choice;
        Scanner scanner = new Scanner(System.in);
        if(person instanceof Patient){
            System.out.println("\nThis person has visited the hospital");
            patientMenu((Patient)person);
            
//            System.out.println("\n");
//            System.out.println(" 1. See the details of Encounters?\n 2. Main Menu");
//            choice = scanner.nextInt();
//            if(choice == 1)
//                printPatient((Patient)person);
        }
        else {
            System.out.println("\nThis person has never met a doctor");
            System.out.println("Would you like to add a visit to hospital for this person?");
            System.out.println(" 1. Yes\n 2. No (Main Menu)");
            choice = scanner.nextInt();
            if(choice == 1)
                person = addVisit(person);
        }
    }
    
    private static void patientMenu(Patient patient) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choose one option from below for "+patient.getName());
            System.out.println("   1. Get DOB and Address");
            System.out.println("   2. Get Hospital Visits (Date and time)");
            System.out.println("   3. Get Vital Signs from recent Hospital Visit");
            System.out.println("   4. Get Vital Signs from all Hospital Visits");
            System.out.println("   5. Check if all Vital Signs are Normal");
            System.out.println("   6. Check if the given Vital Sign is Normal");
            System.out.println("   9. Go to Previous Menu");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println((Person)patient);
                    break;
                case 2:
                    int i = 1;
                    if(patient.getEncounterHistory().getHistory().size() == 0)
                        System.out.println("Patient has only 1 visit\n");
                    else 
                        for(Encounter encounter: patient.getEncounterHistory().getHistory()) {
                            System.out.printf("%3d. %s",i,encounter.getEncounterDatetime());
                            i++;
                        }
                    System.out.printf("%3d. %s",i,patient.getEncounter().getEncounterDatetime());
                    break;
                case 3:
                    System.out.println(patient.getEncounter());
                    break;
                case 4:
                    patient.getEncounterHistory().printHistory();
                    System.out.println("Latest Visit: ");
                    System.out.println(patient.getEncounter());
                    break;
                case 5:
                    if(patient.isPatientNormal())
                        System.out.println("Patient Vital Signs are in Normal Condition");
                    else
                        System.out.println("Patient Vital Signs are Abnormal");
                    break;
                case 6:
                    System.out.print("\nAvailable Values of VitalSigns\n"
                                + "\tRespiratory Rate\n"
                                + "\tHeart Rate\n"
                                + "\tSystolicBP\n"
                                + "\tWeight\n"
                                + "\nEnter the VitalSign Name: ");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    if(patient.isThisVitalSignNormal(condition)) 
                        System.out.println(condition+" for "+patient.getName()+" is Normal");
                    else if(!patient.isThisVitalSignNormal(condition))
                        System.out.println(condition+" for "+patient.getName()+" is not good");
                    break;
                case 9:
                    return;
            }
        }
    }
    
    private static void showAllPatientsMenu(){
        
        if(patientDirectory.getDirectory().isEmpty()) {
            System.out.println("There are no patients created.\nReturning to previous menu.");
            return;
        }
        
        int i = 1;
        int choice;
        Scanner scanner = new Scanner(System.in);
        Patient selectedPatient;
        for(Patient patient: patientDirectory.getDirectory()){
            System.out.printf("%3d. %s\n",i,patient.getFullName());
            i++;
        }
        System.out.println("\nChoose one of the patient to get into details\nOR type something to go back to previous menu: : ");
        try {
            choice = scanner.nextInt();
            selectedPatient = patientDirectory.getDirectory().get(choice - 1);
            patientMenu(selectedPatient);
        }
        catch(Exception e) {
            System.out.println("Going to previous menu\n");
        }
    }

    private static void printPatient(Patient patient) {
        System.out.println("Encounter History of "+patient.getName()+":");
        patient.getEncounterHistory().printHistory();
        System.out.println("\nLatest Encounter Details: ");
        System.out.println(patient.getEncounter());
    }

    private static Patient addVisit(Person person) {
        Patient patient = null;
        if (person instanceof Patient) {
            patient = (Patient)person;
            patient.newEncounter();
        }
        else {
            patient = new Patient(person);
            patientDirectory.getDirectory().add(patient);
            personDirectory.getDirectory().remove(person);
            personDirectory.getDirectory().add(patient);
            patient.newEncounter();
        }
        return patient;
    }

    private static void showSelectedCommunity(String selectedCommunity, String selectedCity) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int good = 0;
            int bad = 0;
            System.out.println("\nChoose one of the following:\n");
            System.out.println(" 1. Show count of patients with good and bad overall Vital Signs");
            System.out.println(" 2. Show count of normal and abnormal patients with given vitalSign");
            System.out.println(" 3. Go to previous menu");
            int choice = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch(choice){
                case 1:
                    for(Patient patient: patientDirectory.getDirectory()) {
                        if(patient.isPatientNormal() && patient.getCommunityName().equals(selectedCommunity)
                                && patient.getCityName().equals(selectedCity))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal Condition: "+good);
                    System.out.println("Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    String condition = scanner.nextLine();
                    for(Patient patient: patientDirectory.getDirectory()) {
                        if(patient.isThisVitalSignNormal(condition))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal "+condition + " :"+good);
                    System.out.println("Patients with abormal "+condition + " :"+bad);
                    break;
                case 3:
                    return;
            }
        }
    }
    
    private static void showSelectedCity(String selectedCity) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int good = 0;
            int bad = 0;
            System.out.println("\nChoose one of the following:\n");
            System.out.println(" 1. Show count of patients with good and bad overall Vital Signs");
            System.out.println(" 2. Show count of normal and abnormal patients with given vitalSign");
            System.out.println(" 3. Go to previous menu");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    for(Patient patient: patientDirectory.getDirectory()) {
                        if(patient.isPatientNormal() && patient.getCityName().equals(selectedCity))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal Condition: "+good);
                    System.out.println("Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    String condition = scanner.nextLine();
                    for(Patient patient: patientDirectory.getDirectory()) {
                        if(patient.isThisVitalSignNormal(condition))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal "+condition + " :"+good);
                    System.out.println("Patients with abormal "+condition + " :"+bad);
                    break;
                case 3:
                    return;
            }
        }
    }
    

}
