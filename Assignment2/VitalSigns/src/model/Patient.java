/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jayas
 */
public class Patient extends Person{
    
    Encounter encounter;
    EncounterHistory encounterHistory;
    Boolean isPatientNormal;
    
    public Boolean isPatientNormal(){
        return encounter.getVitalSigns().areVitalSignsNormal(this);
    }
    
    public Boolean isThisVitalSignNormal(String vitalSign){
        return encounter.getVitalSigns().isThisVitalSignNormal(this, vitalSign);
    }

    public Encounter getRecentEncounter() {
        return encounter;
    }
    
    public String getName() {
        return fullName;
    }

    public void setName(String Name) {
        this.fullName = Name;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
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

    VitalSigns getVitalSigns() {
        return this.getRecentEncounter().getVitalSigns();
    }

    void setVitalSigns(VitalSigns vitalSigns) {
        this.newEncounter();
        this.encounter.setVitalSigns(vitalSigns);
    }
    
}
