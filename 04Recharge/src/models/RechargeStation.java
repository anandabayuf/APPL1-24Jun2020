/*
 * Created By Ananda Bayu Fauzan.
 */
package models;

import interfaces.IRechargeable;

/**
 *
 * @author Ananda Bayu
 */
public class RechargeStation {
    public void recharge(IRechargeable rechargeable){
        rechargeable.recharge();
    }
}
