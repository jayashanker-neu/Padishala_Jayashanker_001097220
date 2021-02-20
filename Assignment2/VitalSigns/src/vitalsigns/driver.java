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
        Person person = new Person();
        initializePerson(person,keyboard);
        initializeVitalSigns(person, keyboard);
        
        String condition;
        
        if (person.isPatientNormal()){
            condition = "Good";
        }
        else {
            condition = "Bad";
        }
        
        System.out.println("Person condition is: "+condition);
    }
    
    public static void initializePerson(Person person, Scanner scanner){
        System.out.println("Enter following Person Details:");
        System.out.print("Name: ");
        person.setName(scanner.nextLine());
        System.out.print("DOB (YYYY-MM-DD): ");
        person.setDob(LocalDate.parse(scanner.nextLine()));
    }
    
    public static void initializeVitalSigns(Person person, Scanner scanner) {
        System.out.println("\nInput VitalSigns");
        System.out.println("RespiratoryRate\tHeartRate\tSystolicBP\tWeightInKilos");
        person.setVitalSigns(new VitalSigns(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        person.getVitalSigns().setWeightInPounds(person.getVitalSigns().getWeightInKilos() * 2.20462262);
    }
    
}
