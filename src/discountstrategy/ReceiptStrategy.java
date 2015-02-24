/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mbrester1
 */
public interface ReceiptStrategy {
    
    public abstract void printReceipt();
    
    public abstract void addLineItem(LineItem lineItem);
    
}
