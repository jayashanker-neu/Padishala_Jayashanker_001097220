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
public class City {

    String name;
    ArrayList<Community> communities;
    
    public void addCity(Community community){
        communities.add(community);
    }
    
    public Community getCommunity(String communityName){
        if(this.communities != null)
            for(Community community: communities)
                if(community.getName().equals(communityName))
                    return community;
        return null;
    }
    
}
