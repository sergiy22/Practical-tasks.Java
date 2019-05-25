/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.k2.oop.error;

/**
 *
 * @author 1710506
 */
public class PersonNotFoundException extends PersonException {

    public PersonNotFoundException() {
        super("Person not found");
    }
  
}
