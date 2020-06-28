/*
 * Created By Ananda Bayu Fauzan.
 */
package models;

import interfaces.ISleeper;

/**
 *
 * @author Ananda Bayu
 */
public class Employee extends Worker implements ISleeper{
    public Employee(String id){
        super(id);
    }
    
    @Override
    public void sleep() {
        //sleep
    }
    
}
