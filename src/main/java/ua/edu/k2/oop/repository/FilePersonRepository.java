/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.k2.oop.repository;

import ua.edu.k2.oop.error.PersonException;
import ua.edu.k2.oop.model.Person;

/**
 *
 * @author 1710508
 */
public class FilePersonRepository implements PersonRepository {

    @Override
    public Person read() throws PersonException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void write(Person o) throws PersonException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
