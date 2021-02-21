/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author jayas
 */
public class driver {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Patient patient = new Patient();
        initializePerson(patient,keyboard);
        initializeVitalSigns(patient, keyboard);
        System.out.println("Vital Signs:\n"+patient.getVitalSigns());

        System.out.println("Person condition is: "+(patient.isPatientNormal()?"Good":"Bad"));
        
        keyboard = new Scanner(System.in);
        
        System.out.println("\nWant to enter details for another visit (Y/N)? ");
        while (!keyboard.nextLine().equals("N")){
            run(patient);
            System.out.println("\nWant to enter details for another visit (Y/N)? ");
        }
        
        System.out.println("\n\nVital Signs History:\n"+patient.getVitalSignsHistory());
        System.out.println("\nLatest Vital Signs:\n"+patient.getVitalSigns());
    }
    
    public static void initializePerson(Patient patient, Scanner scanner){
        System.out.println("Enter following Person Details:");
        System.out.print("Name: ");
        patient.setName(scanner.nextLine());
        System.out.print("DOB (YYYY-MM-DD): ");
        patient.setDob(LocalDate.parse(scanner.nextLine()));
    }
    
    public static void initializeVitalSigns(Patient patient, Scanner scanner) {
        System.out.println("\nInput VitalSigns");
        System.out.println("RespiratoryRate\tHeartRate\tSystolicBP\tWeightInKilos");
        patient.setVitalSigns(new VitalSigns(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
//        patient.getVitalSigns().setWeightInPounds(patient.getVitalSigns().getWeightInKilos() * 2.20462262);
        patient.setVitalSignsHistory(new VitalSignsHistory());
    }
    
    public static void updateVitalSigns(Patient patient, Scanner scanner) {
        System.out.println("\nInput new VitalSigns for: "+patient.getName());
        System.out.println("RespiratoryRate\tHeartRate\tSystolicBP\tWeightInKilos");
        patient.getVitalSignsHistory().getHistory().add(patient.getVitalSigns());
        patient.setVitalSigns(new VitalSigns(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
//        patient.getVitalSigns().setWeightInPounds(patient.getVitalSigns().getWeightInKilos() * 2.20462262);
        
    }
    
    public static void run(Patient patient){
        Scanner keyboard = new Scanner(System.in);
        
        updateVitalSigns(patient, keyboard);
        System.out.println("Updated Vital Signs:\n"+patient.getVitalSigns());
        
        System.out.println("Person condition is: "+(patient.isPatientNormal()?"Good":"Bad"));
        
    }
    
}
