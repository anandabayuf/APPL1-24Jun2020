/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import interfaces.ISecurityUI;

/**
 *
 * @author Ananda Bayu
 */
public class KeyCardCheck {
    private ISecurityUI securityUI;
    
    public KeyCardCheck(ISecurityUI securityUI){
        this.securityUI = securityUI;
    }
    
    public boolean isValid(String code){
        return true;
    }
    
    public boolean validateUser(){
        String code = securityUI.requestKeyCard();
        if(isValid(code))
            return true;
        
        return false;
    }
}
