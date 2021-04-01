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
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
//    public Restaurant createRestaurant(String name, String managerName, int phoneNumber, String address, UserAccount userAccount){
//        Restaurant r = new Restaurant();
//        r.setName(name);
//        r.setManagerName(managerName);
//        r.setPhoneNumber(phoneNumber);
//        r.setAddress(address);
//        r.setUserAccount(userAccount);
//        restaurantList.add(r);  
//        return r;
//    }
    
    public Restaurant createRestaurant(String name, String managerName, int phoneNumber, String address){
        Restaurant r = new Restaurant();
        r.setName(name);
        r.setManagerName(managerName);
        r.setPhoneNumber(phoneNumber);
        r.setAddress(address);
        restaurantList.add(r);  
        return r;
    }
    
    public void deleteRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }
}