/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.k2.oop.repository;

/**
 *
 * @author 1710508
 */
public interface Repository<T> {
    void write(T o) throws Exception;
    T read() throws Exception;
}
