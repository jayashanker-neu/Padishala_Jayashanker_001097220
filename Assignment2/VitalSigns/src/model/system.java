/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class system {
    
    static ArrayList<Address> addresses = new ArrayList<>();
    
    public static void main(String args[]){
        PersonDirectory personDirectory = new PersonDirectory();
        Person person = personDirectory.newPerson();
        System.out.println(person);
        
        person = personDirectory.newPerson();
        System.out.println(person);
        
        System.out.println(personDirectory);
        
    }
    
    private void showMenu(){
        System.out.println("\nChoose one of the following options:");
        System.out.println(" 1. See all people");
        System.out.println(" 2. See all patients");
        System.out.println(" 3. ");
    }
    
    private static Address findAddress(String houseNo, String street, String communityName, String cityName){
        City city = null;
        Community community = null;
        House house = null;
        Address personAddress;
        Boolean addressFound = true;
        for (Address address: addresses){
            city = address.getCity(cityName);
            if(city != null){
                community = city.getCommunity(communityName);
                if(community != null){
                    house = community.getHouse(houseNo, street);
                    if(house == null) {
                        house = new House();
                        addressFound = false;
                    }
                }
                else {
                    community = new Community();
                    house = new House();
                    addressFound = false;
                }
            }
            else {
                
                city = new City();
                community = new Community();
                house = new House();
                addressFound = false;
                
            }
        }
        if(!addressFound){
            personAddress = new Address(city, community, house);
            addAddress(personAddress);
        }
        return personAddress;
    }

}
