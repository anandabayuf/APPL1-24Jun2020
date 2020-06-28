/*
 * Created By Ananda Bayu Fauzan.
 */
package models;

/**
 *
 * @author Ananda Bayu
 */
public abstract class Worker {
    private String id;
    private int workingHours;
    
    public Worker(String id){
        this.id = id;
    }
    
    public void work(int hours){
        this.workingHours += hours;
    }
}
