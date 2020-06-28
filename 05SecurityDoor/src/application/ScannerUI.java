/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import interfaces.ISecurityUI;
import java.util.Scanner;

/**
 *
 * @author Ananda Bayu
 */
public class ScannerUI implements ISecurityUI{
    private Scanner scan;
    
    @Override
    public String requestKeyCard() {
        System.out.println("Slide your key card");
        scan = new Scanner(System.in);
        return scan.next();
    }

    @Override
    public int requestPinCode() {
        System.out.println("Enter your pin code : ");
        scan = new Scanner(System.in);
        return scan.nextInt();
    }
    
}
