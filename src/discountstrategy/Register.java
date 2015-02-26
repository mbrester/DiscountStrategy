/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Mitch
 */
public class Register {
    private ReceiptStrategy receiptStrategy;

    public Register() {
       
       
    }
 
    public void startSale(String custId,ReceiptStrategy reciptStrategy){ 
        this.receiptStrategy = reciptStrategy;
        receiptStrategy.addCustomer(custId);
    }
    
    public void addProduct(String productId, int qty){
    
        receiptStrategy.addLineItem(productId,qty);
       
    }
    
    public void endSale(){
        receiptStrategy.printReceipt();
    }
    

    public ReceiptStrategy getReceiptStrategy() {
        return receiptStrategy;
    }

    public void setReceiptStrategy(ReceiptStrategy receiptStrategy) {
        this.receiptStrategy = receiptStrategy;
    }


    
    
    
}
