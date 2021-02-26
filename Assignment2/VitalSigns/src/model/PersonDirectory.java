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
public class PersonDirectory {

    ArrayList<Person> directory;
    
    public PersonDirectory() {
        directory = new ArrayList<Person>();
    }
    
    public Person newPerson(){
        Person person = new Person();
        directory.add(person);
        return person;
    }
    
        @Override
    public String toString(){
        String returnString = new String();
        int i = 0;
        for (Person person: directory){
            returnString += "Patient "+i+":\n";
            returnString += person;
        }
        
        return returnString;
    }
    
}
