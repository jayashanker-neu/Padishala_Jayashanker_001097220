/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author jayas
 */
public class VitalSigns {

    double respiratoryRate;
    double heartRate;
    double systolicBP;
    double weightInKilos;
    double weightInPounds;
    LocalDateTime vitalSignDatetime;
    
    public VitalSigns(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter following Vital Sign Details: \n");
        System.out.println("RespiratoryRate\tHeartRate\tSystolicBP\tWeightInKilos");
        this.respiratoryRate = scanner.nextDouble();
        this.heartRate = scanner.nextDouble();
        this.systolicBP = scanner.nextDouble();
        this.weightInKilos = scanner.nextDouble();
        this.weightInPounds = this.weightInKilos * 2.20462262;
        this.vitalSignDatetime = LocalDateTime.now();
    }
    
    public VitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double weightInPounds){
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBP = systolicBP;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInKilos * 2.20462262;
        this.vitalSignDatetime = LocalDateTime.now();
    }
    
    public void updateVitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double weightInPounds){
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBP = systolicBP;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInKilos * 2.20462262;
        this.vitalSignDatetime = LocalDateTime.now();
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(double systolicBP) {
        this.systolicBP = systolicBP;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }    

    Boolean isVitalSignsNormal(Patient patient) {
        if (compareVitalSigns(patient.getVitalSigns(),patient.getAgeGroup()) == 0)
            return true;
        else
            return false;
    }

    private int compareVitalSigns(VitalSigns vitalSigns, String ageGroup) {
        int result = 0;
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        
        if(vitalSigns.respiratoryRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.respiratoryRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[1]))
            result = 0;
        
        else 
            return 1;
        
        if(vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[1]))
            result = 0;
        else 
            return 2;
        
        if(vitalSigns.systolicBP >= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[0]) && 
                vitalSigns.systolicBP <= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[1]))
            result = 0;
        else 
            return 3;
        
        if(vitalSigns.weightInKilos >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[0]) && 
                vitalSigns.weightInKilos <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[1]))
            result = 0;
        else 
            return 4;
        
        if(vitalSigns.weightInPounds >= Double.parseDouble(vitalSignsNormal.weightInPounds.get(ageGroup).split("-")[0]) && 
                vitalSigns.weightInPounds <= Double.parseDouble(vitalSignsNormal.weightInPounds.get(ageGroup).split("-")[1]))
            result = 0;
        else 
            return 5;
        
        return result;
    }
    
    @Override
    public String toString(){
        return " DateTime: " + this.vitalSignDatetime
                + "\n Respiratory Rate: "+ this.respiratoryRate + "\n Heart Rate: "+this.heartRate+"\n Systolic Blood Pressure: "+this.systolicBP+"\n Weight(KG): "+this.weightInKilos
                + "\n Weight(lbs): "+this.weightInPounds+"\n";
    }

    Boolean isThisVitalSignNormal(Patient patient, String vitalSign) {
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        
        if(vitalSign.equals("Respiratory Rate"))
            return vitalSigns.respiratoryRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.respiratoryRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[1]);
        else if (vitalSign.equals("Heart Rate"))
            return vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[1]);
        else if (vitalSign.equals("SystolicBP"))
            return vitalSigns.systolicBP >= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[0]) && 
                vitalSigns.systolicBP <= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[1]);
        else if (vitalSign.equals("Weight"))
            return vitalSigns.weightInKilos >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[0]) && 
                vitalSigns.weightInKilos <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[1]);
        else
            System.out.println("Given Vital Sign details are not found.\n");
        return false;
    }
    
}
