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
public class DriverLicence {
    
    private String licNum;
    private String dateIssued;
    private String dateExpiry;
    private String bloodType;
    // TODO: Add Image

    public String getLicNum() {
        return licNum;
    }

    public void setLicNum(String licNum) {
        this.licNum = licNum;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    
    
}
