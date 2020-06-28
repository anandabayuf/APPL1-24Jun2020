/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

/**
 *
 * @author Ananda Bayu
 */
public class Program {
    public static void main(String[] args){
        ScannerUI scannerUI = new ScannerUI();
    
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUI);
        PincodeCheck pinCodeCheck = new PincodeCheck(scannerUI);

        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
}
