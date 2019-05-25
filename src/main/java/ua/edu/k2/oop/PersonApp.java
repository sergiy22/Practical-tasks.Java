/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.k2.oop;

import ua.edu.k2.oop.repository.FilePersonRepository;
import ua.edu.k2.oop.repository.PersonRepository;

/**
 *
 * @author 1710508
 */
public class PersonApp {
    public static void main(String[] args) {
        PersonRepository repo = new FilePersonRepository();
        repo.write();
        repo.read();
    }
}
