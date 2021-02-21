/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.util.ArrayList;

/**
 *
 * @author jayas
 */
class VitalSignsHistory {
    
    ArrayList<VitalSigns> history;
    
    public VitalSignsHistory() {
        history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public void printHistory() {
        toString();
    }
    
    public String toString() {
        String returnString = new String();
        int i = 1;
//        System.out.println("History of "+patient.getName()+" with DOB: "+patient.getDob()+" is: ");
        for (VitalSigns visit: getHistory()) {
            returnString+="Vital Signs "+i+": \n";
            returnString += visit;
            i++;
        }
        return returnString;
    }
    
}
