/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Person;

/**
 *
 * @author jayas
 */
public class ReportJPanel extends javax.swing.JPanel {

    Person person;
    /**
     * Creates new form ReportJPanel
     */
    public ReportJPanel(Person person) {
        initComponents();
        
        this.person = person;
        
        txtAge.setText(person.getAge());
        txtAllergy1.setText(person.getMedicalRecord().getAllergy1());
        txtAllergy2.setText(person.getMedicalRecord().getAllergy2());
        txtAllergy3.setText(person.getMedicalRecord().getAllergy3());
        txtBloodType.setText(person.getDriverLicence().getBloodType());
        txtCheckingAccNum.setText(person.getCheckingAcc().getAccNum());
        txtCheckingBal.setText(person.getCheckingAcc().getAccBal());
        txtCheckingBank.setText(person.getCheckingAcc().getName());
        txtCheckingRoutingNum.setText(person.getCheckingAcc().getRoutingNum());
        txtSavingsAccNum.setText(person.getSavingsAcc().getAccNum());
        txtSavingsBal.setText(person.getSavingsAcc().getAccBal());
        txtSavingsBank.setText(person.getSavingsAcc().getName());
        txtSavingsRoutingNum.setText(person.getSavingsAcc().getRoutingNum());
        txtCity.setText(person.getAddress().getCity());
        txtDob.setText(person.getDob());
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtLicDateExpiry.setText(person.getDriverLicence().getDateExpiry());
        txtLicDateIssued.setText(person.getDriverLicence().getDateIssued());
        txtLicNum.setText(person.getDriverLicence().getLicNum());
        txtMedRecNum.setText(person.getMedicalRecord().getMedicalRecordNum());
        txtPhone.setText(person.getPhoneNum());
        txtSsn.setText(person.getSsn());
        txtState.setText(person.getAddress().getState());
        txtWeight.setText(person.getWeight());
        txtZip.setText(person.getAddress().getZip());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReport = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblPersonalInfo = new javax.swing.JLabel();
        lblBloodType = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblBanks = new javax.swing.JLabel();
        lblSavings = new javax.swing.JLabel();
        lblChecking = new javax.swing.JLabel();
        lblSavingsAcc = new javax.swing.JLabel();
        lblSavingsRoutingNum = new javax.swing.JLabel();
        lblSavingsBank = new javax.swing.JLabel();
        lblSavingsBal = new javax.swing.JLabel();
        lblCheckingAcc = new javax.swing.JLabel();
        lblRoutingNum = new javax.swing.JLabel();
        lblCheckingBank = new javax.swing.JLabel();
        lblCheckingBal = new javax.swing.JLabel();
        lblMedicalRec = new javax.swing.JLabel();
        lblMedRecNum = new javax.swing.JLabel();
        lblAllergy1 = new javax.swing.JLabel();
        lblAllergy2 = new javax.swing.JLabel();
        lblAllergy3 = new javax.swing.JLabel();
        lblDriverLicence = new javax.swing.JLabel();
        lblLicence = new javax.swing.JLabel();
        lblIssuedDate = new javax.swing.JLabel();
        lblExpiry = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtMedRecNum = new javax.swing.JTextField();
        txtAllergy1 = new javax.swing.JTextField();
        txtAllergy2 = new javax.swing.JTextField();
        txtAllergy3 = new javax.swing.JTextField();
        txtBloodType = new javax.swing.JTextField();
        txtLicNum = new javax.swing.JTextField();
        txtLicDateIssued = new javax.swing.JTextField();
        txtLicDateExpiry = new javax.swing.JTextField();
        txtSavingsBank = new javax.swing.JTextField();
        txtCheckingBank = new javax.swing.JTextField();
        txtSavingsAccNum = new javax.swing.JTextField();
        txtSavingsRoutingNum = new javax.swing.JTextField();
        txtCheckingAccNum = new javax.swing.JTextField();
        txtCheckingRoutingNum = new javax.swing.JTextField();
        txtSavingsBal = new javax.swing.JTextField();
        txtCheckingBal = new javax.swing.JTextField();

        lblReport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("Person Report");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblStreet.setText("Street Address:");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblZip.setText("Zip Code:");

        lblPersonalInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPersonalInfo.setText("Personal Information");

        lblBloodType.setText("Blood Type:");

        lblPhone.setText("Phone Number:");

        lblDob.setText("DOB:");

        lblAge.setText("Age:");

        lblHeight.setText("Height:");

        lblWeight.setText("Weight:");

        lblSsn.setText("SSN:");

        lblBanks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanks.setText("Banking Details");

        lblSavings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSavings.setText("Savings");

        lblChecking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChecking.setText("Checking");

        lblSavingsAcc.setText("Account Number:");

        lblSavingsRoutingNum.setText("Routing Number:");

        lblSavingsBank.setText("Bank Name:");

        lblSavingsBal.setText("Balance:");

        lblCheckingAcc.setText("Account Number:");

        lblRoutingNum.setText("Routing Number:");

        lblCheckingBank.setText("Bank Name:");

        lblCheckingBal.setText("Balance:");

        lblMedicalRec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedicalRec.setText("Medical Record");

        lblMedRecNum.setText("Medical Record Number:");

        lblAllergy1.setText("Allergy 1:");

        lblAllergy2.setText("Allergy 2:");

        lblAllergy3.setText("Allergy 3:");

        lblDriverLicence.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDriverLicence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriverLicence.setText("Drivers Licence");

        lblLicence.setText("Licence Number:");

        lblIssuedDate.setText("Issued Date:");

        lblExpiry.setText("Expiry Date:");

        txtFirstName.setEditable(false);

        txtLastName.setEditable(false);

        txtStreet.setEditable(false);

        txtCity.setEditable(false);

        txtState.setEditable(false);

        txtZip.setEditable(false);

        txtDob.setEditable(false);

        txtAge.setEditable(false);

        txtHeight.setEditable(false);

        txtWeight.setEditable(false);

        txtSsn.setEditable(false);

        txtPhone.setEditable(false);

        txtMedRecNum.setEditable(false);

        txtAllergy1.setEditable(false);

        txtAllergy2.setEditable(false);

        txtAllergy3.setEditable(false);

        txtBloodType.setEditable(false);

        txtLicNum.setEditable(false);

        txtLicDateIssued.setEditable(false);

        txtLicDateExpiry.setEditable(false);

        txtSavingsBank.setEditable(false);

        txtCheckingBank.setEditable(false);

        txtSavingsAccNum.setEditable(false);

        txtSavingsRoutingNum.setEditable(false);

        txtCheckingAccNum.setEditable(false);

        txtCheckingRoutingNum.setEditable(false);

        txtSavingsBal.setEditable(false);

        txtCheckingBal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBanks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSavingsRoutingNum)
                    .addComponent(lblSavingsAcc)
                    .addComponent(lblSavingsBank)
                    .addComponent(lblSavingsBal))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSavings)
                    .addComponent(txtSavingsBank, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtSavingsAccNum)
                    .addComponent(txtSavingsRoutingNum)
                    .addComponent(txtSavingsBal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblChecking))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRoutingNum)
                            .addComponent(lblCheckingAcc)
                            .addComponent(lblCheckingBank)
                            .addComponent(lblCheckingBal))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCheckingBank)
                            .addComponent(txtCheckingAccNum)
                            .addComponent(txtCheckingRoutingNum)
                            .addComponent(txtCheckingBal, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
            .addComponent(lblDriverLicence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblLicence)
                .addGap(18, 18, 18)
                .addComponent(txtLicNum, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblIssuedDate)
                .addGap(18, 18, 18)
                .addComponent(txtLicDateIssued, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblExpiry)
                .addGap(18, 18, 18)
                .addComponent(txtLicDateExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblZip)
                            .addComponent(lblState)
                            .addComponent(lblCity)
                            .addComponent(lblStreet)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtZip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPhone)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblSsn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblWeight))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblDob))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHeight, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtAge)
                            .addComponent(txtHeight)
                            .addComponent(txtWeight)
                            .addComponent(txtSsn)
                            .addComponent(txtPhone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblPersonalInfo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAllergy1)
                    .addComponent(lblMedRecNum)
                    .addComponent(lblAllergy2)
                    .addComponent(lblAllergy3)
                    .addComponent(lblBloodType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedicalRec)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMedRecNum)
                        .addComponent(txtAllergy1)
                        .addComponent(txtAllergy2)
                        .addComponent(txtAllergy3)
                        .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReport)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPersonalInfo)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeight)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSsn)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFirstName)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStreet)
                                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCity)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblState)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedicalRec)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMedRecNum)
                                    .addComponent(txtMedRecNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAllergy1)
                                    .addComponent(txtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAllergy2)
                                    .addComponent(txtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAllergy3)
                                    .addComponent(txtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBloodType)
                                    .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZip)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(lblDriverLicence)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicence)
                            .addComponent(lblIssuedDate)
                            .addComponent(lblExpiry)
                            .addComponent(txtLicNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicDateIssued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicDateExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lblBanks)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSavings)
                    .addComponent(lblChecking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingsBank)
                            .addComponent(txtSavingsBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingsAcc)
                            .addComponent(txtSavingsAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingsRoutingNum)
                            .addComponent(txtSavingsRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingsBal)
                            .addComponent(txtSavingsBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingBank)
                            .addComponent(txtCheckingBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingAcc)
                            .addComponent(txtCheckingAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRoutingNum)
                            .addComponent(txtCheckingRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingBal)
                            .addComponent(txtCheckingBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAllergy1;
    private javax.swing.JLabel lblAllergy2;
    private javax.swing.JLabel lblAllergy3;
    private javax.swing.JLabel lblBanks;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblChecking;
    private javax.swing.JLabel lblCheckingAcc;
    private javax.swing.JLabel lblCheckingBal;
    private javax.swing.JLabel lblCheckingBank;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblDriverLicence;
    private javax.swing.JLabel lblExpiry;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblIssuedDate;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicence;
    private javax.swing.JLabel lblMedRecNum;
    private javax.swing.JLabel lblMedicalRec;
    private javax.swing.JLabel lblPersonalInfo;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblRoutingNum;
    private javax.swing.JLabel lblSavings;
    private javax.swing.JLabel lblSavingsAcc;
    private javax.swing.JLabel lblSavingsBal;
    private javax.swing.JLabel lblSavingsBank;
    private javax.swing.JLabel lblSavingsRoutingNum;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAllergy1;
    private javax.swing.JTextField txtAllergy2;
    private javax.swing.JTextField txtAllergy3;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtCheckingAccNum;
    private javax.swing.JTextField txtCheckingBal;
    private javax.swing.JTextField txtCheckingBank;
    private javax.swing.JTextField txtCheckingRoutingNum;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicDateExpiry;
    private javax.swing.JTextField txtLicDateIssued;
    private javax.swing.JTextField txtLicNum;
    private javax.swing.JTextField txtMedRecNum;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSavingsAccNum;
    private javax.swing.JTextField txtSavingsBal;
    private javax.swing.JTextField txtSavingsBank;
    private javax.swing.JTextField txtSavingsRoutingNum;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
