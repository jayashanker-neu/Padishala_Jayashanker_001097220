/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class Encounter {

    VitalSigns vitalSigns;
    String encounterDatetime;

    public Encounter() {
        this.vitalSigns = new VitalSigns();
        this.encounterDatetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }
    
    public Encounter(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) {
        this.vitalSigns = new VitalSigns(respiratoryRate, heartRate, systolicBP, weightInKilos);
        this.encounterDatetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getEncounterDatetime() {
        return encounterDatetime;
    }

    public void setEncounterDatetime(String encounterDatetime) {
        this.encounterDatetime = encounterDatetime;
    }
    
    @Override
    public String toString(){
        return " Encounter Datetime: "+this.encounterDatetime +this.vitalSigns;
    }
    
}
