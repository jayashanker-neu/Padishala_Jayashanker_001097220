/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class system {
    
    static PersonDirectory personDirectory = new PersonDirectory();
    static PatientDirectory patientDirectory = new PatientDirectory();
    
    public static void main(String args[]) {
        
        addFixedData();
        
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
                    showAllCitiesDetails();
                    break;
                case 6:
                    showAllCommunitiesDetails();
                    break;
                case 7:
                    ArrayList<Community> allCommunities;
                    int good = 0, bad = 0;
                    allCommunities = showAllCommunities(true);
                    if(allCommunities.isEmpty()) {
                        System.out.println("There is no data.\nReturning to main menu.");
                        break;
                    }
                    System.out.print("\nAvailable Values of VitalSigns\n"
                                + "\tRespiratory Rate\n"
                                + "\tHeart Rate\n"
                                + "\tSystolicBP\n"
                                + "\tWeight");
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    Boolean vitalSignExists = true;
                    for (Community community: allCommunities) {
                        good = 0;
                        bad = 0;
                        for(Patient p: patientDirectory.getDirectory()) {
                            if(!p.getCommunityName().toLowerCase().equals(community.getCommunityName().toLowerCase()) ||
                                    !p.getCityName().toLowerCase().equals(community.getCityName().toLowerCase()))
                                continue;
                            if(p.isThisVitalSignNormal(condition) == null){
                                System.out.println("Vital Sign does not exist.\n");
                                vitalSignExists = false;
                                break;
                            }
                            if(p.isThisVitalSignNormal(condition))
                                good++;
                            else
                                bad++;
                        }
                        if(!vitalSignExists)
                            break;
                        System.out.println("Patients with Normal "+condition + " in "+community.getCommunityName()+", "+community.getCityName()+": "+good);
                        System.out.println("Patients with abormal "+condition + " in "+community.getCommunityName()+", "+community.getCityName()+": "+bad);
                    }
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
        System.out.println(" 7. See number of abnormal cases of given vitalSign in each community");
        System.out.println(" 9. Exit");
    }
    
    private static ArrayList<City> showAllCities(Boolean print){
        Set<City> distinctCities = new HashSet<>();
        int personCount = 0;
        while(personCount != personDirectory.getDirectory().size()) {
            personCount = 0;
            Boolean found = false;
            try {
                for(Person p: personDirectory.getDirectory()) {
                    if(distinctCities.isEmpty()) {
                        distinctCities.add((City)p);
                    }
                    else {
                        for(City city: distinctCities) {
                            found = false;
                            if(p.getCityName().toLowerCase().equals(city.getCityName().toLowerCase())){
                                found = true;
                                break;
                            }
                        }
                        if(!found)
                            distinctCities.add((City)p);
                    }
                    personCount++;
                }
            }
            catch(Exception e){ }
        }
        int i = 1;
        ArrayList<City> distinctCitiesList = new ArrayList<>();
        for(City city: distinctCities) {
            if(print)
                System.out.printf("%3d. %s\n",i,city.getCityName());
            distinctCitiesList.add(city);
            i++;
        }
        return distinctCitiesList;
    }
    
    private static void showAllCitiesDetails(){
        int i = 1;
        int choice;
        String selectedCity;
        Scanner scanner = new Scanner(System.in);
        ArrayList<City> allCities = showAllCities(true);
        if(allCities.isEmpty()) {
            System.out.println("There is no data to show.\nReturning to previous menu.");
            return;
        }
        System.out.println("\nChoose one of the cities to get into details\nOR type something to go back to previous menu: : ");
        try {
            choice = scanner.nextInt();
            selectedCity = allCities.get(choice - 1).getCityName();
            showSelectedCity(selectedCity);
        }
        catch(Exception e){
            System.out.println("Going to previous menu\n");
        }
    }
    
    private static ArrayList<Community> showAllCommunities(Boolean print){
        Set<Community> distinctCommunities = new HashSet<>();
        int personCount = 0;
        while(personCount != personDirectory.getDirectory().size()) {
            personCount = 0;
            Boolean found = false;
            try {
                for(Person p: personDirectory.getDirectory()) {
                    if(distinctCommunities.isEmpty()) {
                        distinctCommunities.add((Community)p);
                    }
                    else {
                        for(Community community: distinctCommunities) {
                            found = false;
                            if(p.getCommunityName().toLowerCase().equals(community.getCommunityName().toLowerCase()) && 
                                    p.getCityName().toLowerCase().equals(community.getCityName().toLowerCase())) {
                                found = true;
                                break;
                            }
                        }
                        if(!found)
                            distinctCommunities.add((Community)p);
                    }
                    personCount++;
                }
            }
            catch(Exception e){ }
        }
        int i = 1;
        ArrayList<Community> distinctCommunitiesList = new ArrayList<>();
        for(Community community: distinctCommunities) {
            if(print)
                System.out.printf("%3d. %s, %s\n",i,community.getCommunityName(), community.getCityName());
            distinctCommunitiesList.add(community);
            i++;
        }
        return distinctCommunitiesList;
    }
    
    private static void showAllCommunitiesDetails(){
        int i = 1;
        int choice;
        String selectedCommunity;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Community> allCommunities = showAllCommunities(true);
        if(allCommunities.isEmpty()) {
            System.out.println("There is no data.\nReturning to previous menu.");
            return;
        }
        System.out.println("\nChoose one of the communities to get into details\nOR type something to go back to previous menu: : ");
        try {
            choice = scanner.nextInt();
            selectedCommunity = allCommunities.get(choice - 1).getCommunityName();
            showSelectedCommunity(selectedCommunity, allCommunities.get(choice - 1).getCityName());
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
            System.out.println("   7. Add new visit to Hospital");
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
                            System.out.printf("%3d. %s\n",i,encounter.getEncounterDatetime());
                            i++;
                        }
                    System.out.printf("%3d. %s\n",i,patient.getEncounter().getEncounterDatetime());
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
                case 7:
                    patient.newEncounter();
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
            System.out.println("Going to main menu\n");
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
                        if(!patient.getCommunityName().toLowerCase().equals(selectedCommunity.toLowerCase())
                                || !patient.getCityName().toLowerCase().equals(selectedCity.toLowerCase()))
                            continue;
                        if(patient.isPatientNormal())
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal Condition: "+good);
                    System.out.println("Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nAvailable Values of VitalSigns\n"
                                + "\tRespiratory Rate\n"
                                + "\tHeart Rate\n"
                                + "\tSystolicBP\n"
                                + "\tWeight\n"
                                + "\nEnter the VitalSign Name: ");
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    scanner = new Scanner(System.in);
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
                        if(!patient.getCityName().toLowerCase().equals(selectedCity.toLowerCase()))
                            continue;
                        if(patient.isPatientNormal())
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("Patients with Normal Condition: "+good);
                    System.out.println("Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    scanner = new Scanner(System.in);
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
    
    public static void addFixedData() {
        // Adolescent -- All Good
        patientDirectory.newPatient("jay1", "p", "1996-08-09", "15", "berkley", "gloversville", 13, 56, 115, 60);
        
        // Adolescent -- All bad
        patientDirectory.newPatient("jay2", "p", "1996-08-09", "15", "anarbor", "virginia", 10, 10, 10, 10);
        
        // New Born
        patientDirectory.newPatient("jay3", "p", "2020-03-01", "15", "charlotte", "north carolina", 35, 125, 56, 2.5);
        
        // New Born
        patientDirectory.newPatient("jay4", "p", "2020-03-01", "15", "delmar", "west virginia", 55, 155, 55, 3.5);
        
        // Infant
        patientDirectory.newPatient("jay5", "p", "2020-02-01", "15", "berkley", "gloversville", 25, 85, 75, 5.5);
        
        // Infant
        patientDirectory.newPatient("jay6", "p", "2020-02-01", "15", "anarbor", "virginia", 35, 155, 69, 4.5);
        
        // Toddler
        patientDirectory.newPatient("jay7", "p", "2019-08-09", "15", "charlotte", "north carolina", 25, 85, 85, 12);
        
        // Toddler
        patientDirectory.newPatient("jay8", "p", "2019-08-09", "15", "delmar", "west virginia", 35, 35, 50, 5);
        
        // Preschool
        patientDirectory.newPatient("jay9", "p", "2017-08-09", "15", "anarbor", "virginia", 35, 95, 95, 13);
        
        // Preschool
        patientDirectory.newPatient("jay10", "p", "2017-08-09", "15", "berkley", "gloversville", 25, 85, 95, 13);
        
        // School Age
        patientDirectory.newPatient("jay11", "p", "2011-08-09", "15", "mission main", "boston", 35, 65, 75, 25);
        
        // School Age
        patientDirectory.newPatient("jay12", "p", "2011-08-09", "15", "anarbor", "virginia", 25, 76, 86, 29);
        
        // Adolescent 
        patientDirectory.newPatient("jay13", "p", "1996-08-09", "15", "mission main", "boston", 30, 100, 115, 60);
        
        // Adolescent 
        patientDirectory.newPatient("jay14", "p", "1996-08-09", "15", "charlotte", "north carolina", 15, 80, 115, 70);
        
        // Adolescent 
        patientDirectory.newPatient("jay15", "p", "1996-08-09", "15", "mission main", "boston", 25, 40, 100, 60);
        
        for(Patient patient: patientDirectory.getDirectory())
            personDirectory.getDirectory().add(patient);
        
    }
    

}
