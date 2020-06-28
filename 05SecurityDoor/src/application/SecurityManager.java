/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import java.util.Scanner;

/**
 *
 * @author Ananda Bayu
 */
public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PincodeCheck pinCodeCheck;
    private Scanner scan;
    
    public SecurityManager(KeyCardCheck keyCardCheck, PincodeCheck pinCodeCheck){
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
        scan = new Scanner(System.in);
    }
    
    public void check(){
        System.out.println("Choose option:");
        System.out.println("1 - KeyCard");
        System.out.println("2 - PinCode");
        System.out.println("Your option:");
        int option = scan.nextInt();
        
        switch(option){
            case 1 :
                System.out.println(this.keyCardCheck.validateUser());
                break;
            case 2 :
                System.out.println(this.pinCodeCheck.validateUser());
                break;
        }
    }
}
