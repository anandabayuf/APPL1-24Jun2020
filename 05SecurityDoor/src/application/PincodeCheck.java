/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import interfaces.ISecurityUI;

/**
 *
 * @author Ananda Bayu
 */
public class PincodeCheck {
    private ISecurityUI securityUI;
    
    public PincodeCheck(ISecurityUI securityUI){
        this.securityUI = securityUI;
    }
    
    public boolean isValid(int pin){
        return true;
    }
    
    public boolean validateUser(){
        int pin = securityUI.requestPinCode();
        if(isValid(pin))
            return true;
        
        return false;
    }
}
