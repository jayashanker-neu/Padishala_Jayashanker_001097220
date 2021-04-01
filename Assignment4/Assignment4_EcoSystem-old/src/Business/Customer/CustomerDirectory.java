/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name, String address, int phoneNumber, UserAccount userAccount){
        Customer c = new Customer(userAccount);
        c.setName(name);
        c.setAddress(address);
        c.setPhoneNumber(phoneNumber);
        customerList.add(c);  
        return c;
    }
	
	public Customer createCustomer(String name, String address, int phoneNumber){
        Customer c = new Customer();
        c.setName(name);
        c.setAddress(address);
        c.setPhoneNumber(phoneNumber);
        customerList.add(c);  
        return c;
    }
    
     public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }
    
    
}