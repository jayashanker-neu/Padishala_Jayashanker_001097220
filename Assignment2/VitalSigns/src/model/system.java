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
public class system {
    
    public static void main(String args[]){
        PersonDirectory personDirectory = new PersonDirectory();
        Person person = personDirectory.newPerson();
        System.out.println(person);
        
        person = personDirectory.newPerson();
        System.out.println(person);
        
        System.out.println(personDirectory);
        
    }

}
