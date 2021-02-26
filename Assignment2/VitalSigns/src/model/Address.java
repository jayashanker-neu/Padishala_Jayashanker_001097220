/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author  Jayashanker Padishala
 * @NUID    001097220
 */
public class Address {

    City city;
    Community community;
    House house;

    Address(City city, Community community, House house) {
        this.city = city;
        this.community = community;
        this.house = house;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public City getCity(String cityName){
        if (this.city.getName().equals(cityName))
            return this.city;
        return null;
    }
    
}
