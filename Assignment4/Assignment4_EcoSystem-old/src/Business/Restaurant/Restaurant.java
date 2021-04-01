/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String managerName;
    private Integer phoneNumber;
    private String address;
    private ArrayList<String> menulist;
    
    private UserAccount userAccount;
    
    public Restaurant(){
        userAccount = new UserAccount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ArrayList<String> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<String> menulist) {
        this.menulist = menulist;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
}