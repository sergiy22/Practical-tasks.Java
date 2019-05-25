/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.k2.oop.repository;

import ua.edu.k2.oop.model.Person;
import ua.edu.k2.oop.error.PersonException;

/**
 *
 * @author 1710508
 */
public interface PersonRepository extends Repository<Person>{

    @Override
    public Person read() throws PersonException;

    @Override
    public void write(Person o) throws PersonException;
    
}
