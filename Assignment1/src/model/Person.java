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
public class Person {
    
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String dob;
    private String age;
    private String height;
    private String weight;
    private String ssn;

    Address address;
    Bank savingsAcc;
    Bank checkingAcc;
    DriverLicence driverLicence;
    MedicalRecord medicalRecord;
    
    public Person() {
        address = new Address();
        savingsAcc = new Bank();
        checkingAcc = new Bank();
        driverLicence = new DriverLicence();
        medicalRecord = new MedicalRecord();
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Bank getSavingsAcc() {
        return savingsAcc;
    }

    public void setSavingsAcc(Bank savingsAcc) {
        this.savingsAcc = savingsAcc;
    }

    public Bank getCheckingAcc() {
        return checkingAcc;
    }

    public void setCheckingAcc(Bank checkingAcc) {
        this.checkingAcc = checkingAcc;
    }

    public DriverLicence getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(DriverLicence driverLicence) {
        this.driverLicence = driverLicence;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    
    
    
}
