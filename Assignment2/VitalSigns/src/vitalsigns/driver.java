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
        initializePerson(patient);
        initializeVitalSigns(patient);
        System.out.println("Vital Signs:\n"+patient.getVitalSigns());

        System.out.println("Patient condition is: "+(patient.isPatientNormal()?"Good":"Bad"));
        
        showMenu();
        
        keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        while (choice != 9) {
            keyboard = new Scanner(System.in);
            switch(choice){
                case 1:
                    patient.updateInfo();
                    break;
                case 2:
//                    patient.newVitalSign();
                    updateVitalSigns(patient);
                    break;
                case 3:
                    patient.getVitalSignsHistory().printHistory();
                    break;
                case 4:
                    System.out.println("\nLatest Vital Signs of "+patient.getName());
                    System.out.println(patient.getVitalSigns());
                case 5:
                    System.out.print("\nAvailable Values of VitalSigns\n"
                            + "\tRespiratory Rate\n"
                            + "\tHeart Rate\n"
                            + "\tSystolicBP\n"
                            + "\tWeight\n"
                            + "\nEnter the VitalSign Name: ");
                    
                    patient.isThisVitalSignNormal(keyboard.nextLine());
                case 6:
                    System.out.println("\nPatient Name: "+patient.getName());
                    System.out.println("Date of Birth: "+patient.getDob());
                    System.out.println("Age Group: "+patient.getAgeGroup());
                default:
                    System.out.println("\nProvide correct input\n");
            }
            showMenu();
            choice = keyboard.nextInt();
        }
    }
    
    public static void showMenu(){
        System.out.println("\nChoose one of the option below:\n");
        System.out.println("1. Update Patient Info");
        System.out.println("2. Add latest Vital Signs Info from new visit");
        System.out.println("3. See history of Vital Signs");
        System.out.println("4. See latest Vital Signs");
        System.out.println("5. Check if given Vital Sign is in normal condition");
        System.out.println("6. View Patient Info");
        System.out.println("9. Exit\n");
        System.out.println("Choice: ");
    }
    
    public static void initializePerson(Patient patient){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter following Patient Details:");
        System.out.print("Name: ");
        patient.setName(scanner.nextLine());
        System.out.print("DOB (YYYY-MM-DD): ");
        patient.setDob(LocalDate.parse(scanner.nextLine()));
    }
    
    public static void initializeVitalSigns(Patient patient) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput VitalSigns");
        System.out.println("RespiratoryRate\tHeartRate\tSystolicBP\tWeightInKilos");
        patient.setVitalSigns(new VitalSigns(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        patient.setVitalSignsHistory(new VitalSignsHistory());
    }
    
    public static void updateVitalSigns(Patient patient) {
        patient.newVitalSign();
    }
    
}
