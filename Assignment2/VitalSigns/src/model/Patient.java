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
 * @author jayas
 */
public class Patient {
    
    String Name;
    LocalDate dob;
    Encounter encounter;
    String ageGroup;
    EncounterHistory encounterHistory;
    Boolean isPatientNormal;
    
    public Boolean isPatientNormal(){
        return encounter.getVitalSigns().areVitalSignsNormal(this);
    }
    
    public Boolean isThisVitalSignNormal(String vitalSign){
        return encounter.getVitalSigns().isThisVitalSignNormal(this, vitalSign);
    }

    public Encounter getEncounter() {
        return encounter;
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

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    private void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter newEncounter(){
        if (this.encounter != null)
            this.encounterHistory.getHistory().add(this.encounter);
        this.encounter = new Encounter();
        this.isPatientNormal = this.isPatientNormal();
        encounter.vitalSigns.setAreVitalSignsNormal(this.isPatientNormal);
        return this.encounter;
    }

    void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Patient Name: ");
        this.Name = scanner.nextLine();
        System.out.println("\nEnter Patient DOB: ");
        this.setDob(LocalDate.parse(scanner.nextLine()));
    }

    VitalSigns getVitalSigns() {
        return this.getEncounter().getVitalSigns();
    }

    void setVitalSigns(VitalSigns vitalSigns) {
        this.newEncounter();
        this.encounter.setVitalSigns(vitalSigns);
    }
    
}
