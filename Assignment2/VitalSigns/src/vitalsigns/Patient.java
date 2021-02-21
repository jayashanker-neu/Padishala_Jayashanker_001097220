/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author jayas
 */
public class Patient {
    
    String Name;
    LocalDate dob;
    VitalSigns vitalSigns;
    String ageGroup;
    VitalSignsHistory vitalSignsHistory;
    
    public Boolean isPatientNormal(){
        return vitalSigns.isVitalSignsNormal(this);
    }
    
    public Boolean isThisVitalSignNormal(String vitalSign){
        return vitalSigns.isThisVitalSignNormal(this, vitalSign);
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDate getDob() {
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

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    private void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns newVitalSign(){
        VitalSigns vitalSigns = new VitalSigns();
        this.vitalSignsHistory.getHistory().add(this.vitalSigns);
        this.vitalSigns = vitalSigns;
        return vitalSigns;
    }

    void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Patient Name: ");
        this.Name = scanner.nextLine();
        System.out.println("\nEnter Patient DOB: ");
        this.setDob(LocalDate.parse(scanner.nextLine()));
    }
    
}
