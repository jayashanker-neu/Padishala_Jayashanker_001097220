/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class Person {

    String firstName;
    String lastName;
    String fullName;
    LocalDate dob;
    String ageGroup;
    
    Address address;
    
    String houseNo;
    String street;
    String community;
    String city;
    
//    static PersonDirectory personDirectory;

    public Person(){
        System.out.println("\nEnter Person First Name: ");
        Scanner scanner = new Scanner(System.in);
        this.firstName = scanner.nextLine();
        System.out.println("\nEnter Person Last Name: ");
        this.lastName = scanner.nextLine();
        this.fullName = firstName + " " + lastName;
        System.out.println("\nEnter DOB (YYYY-MM-DD): ");
        Boolean goodDate = false;
        while(!goodDate) {
            try {
                this.setDob(LocalDate.parse(scanner.nextLine()));
                goodDate = true;
            }
            catch (Exception e) {
                System.out.println("\nEnter DOB in correct format (YYYY-MM-DD): ");
            }
        }
        
        System.out.println("Enter House No: ");
        this.houseNo = scanner.nextLine();
        
        System.out.println("Enter Street: ");
        this.street = scanner.nextLine();
        
        System.out.println("Enter Community: ");
        this.community = scanner.nextLine();
        
        System.out.println("Enter City: ");
        this.city = scanner.nextLine();
        
        
        
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        Period age = Period.between(dob, LocalDate.now());
        if(age.getYears() == 0 && age.getMonths() == 0){
            this.setAgeGroup("Newborn");
        }
        else if(age.getYears() == 0 && age.getMonths() <= 11 && age.getDays() <= 31){
            this.setAgeGroup("Infant");
        }
        else if(age.getYears() < 3 && age.getMonths() <= 11 && age.getDays() <= 31) {
            this.setAgeGroup("Toddler");
        }
        else if(age.getYears() < 5 && age.getMonths() <= 11 && age.getDays() <= 31) {
            this.setAgeGroup("Preschooler");
        }
        else if(age.getYears() < 12 && age.getMonths() <= 11 && age.getDays() <= 31){
            this.setAgeGroup("SchoolAge");
        }
        else {
            this.setAgeGroup("Adolescent");
        }
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
    
    void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Person First Name: ");
        this.firstName = scanner.nextLine();
        System.out.println("\nEnter Person Last Name: ");
        this.lastName = scanner.nextLine();
        System.out.println("\nEnter Patient DOB: ");
        this.setDob(LocalDate.parse(scanner.nextLine()));
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public Address getAddress(){
        return this.address;
    }
    
    
//    public static Person newPerson(){
//        if (personDirectory == null)
//            personDirectory = new PersonDirectory();
//        Person person = new Person();
//        personDirectory.directory.add(person);
//        return person;
//    }
    
        
    public String toString(){
        return "\nName: " + this.fullName + "\nDOB: " + this.dob;
    }
    
}
