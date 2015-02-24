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
public class ReceiptManeger {
    
    private ReceiptStrategy receiptStrategy;
    
    
    public void addLineItem(LineItem lineItem){
        receiptStrategy.addLineItem(lineItem);
    }
    
    public void printReceipt(){
        receiptStrategy.printReceipt();
    }
    
    
}
