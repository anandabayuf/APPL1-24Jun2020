/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ananda Bayu
 */
public class Program {
    public static void main(String[] args){
        Employee employee = new Employee("Name");
        Manager manager = new Manager("Manager name", new ArrayList<String>());
        
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        list.add(manager);
        
        DetailsPrinter printer = new DetailsPrinter(list);
        
        printer.printDetails();
    }
}
