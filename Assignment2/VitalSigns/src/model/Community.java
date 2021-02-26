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
public class Community {

    String name;
    ArrayList<House> houses;
    
    public void addHouse(House house){
        houses.add(house);
    }
    
    public House getHouse(String number, String street){
        if(this.houses != null)
            for(House house: houses)
                if(house.getNumber().equals(number) && house.getStreet().equals(street))
                    return house;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
}
