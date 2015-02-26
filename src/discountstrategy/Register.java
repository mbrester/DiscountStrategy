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
    private DataStrategy dB;
    private Customer customer;
   ;

    public Register(ReceiptStrategy reciptStrategy, DataStrategy dB) {
        this.receiptStrategy = reciptStrategy;
        this.dB = dB;
    }
    
    
    public void startSale(String custId){
        customer = lookUpCustomer(custId);
        receiptStrategy.addCustomer(customer);
    }
    
    public void addProduct(String productId, int qty){
        
        LineItem lineItem = new LineItem(lookUpProduct(productId),qty);
        receiptStrategy.addLineItem(lineItem);
       
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

    public DataStrategy getdB() {
        return dB;
    }

    public void setdB(DataStrategy dB) {
        this.dB = dB;
    }

    private Customer lookUpCustomer(String custId) {
        return dB.findCustomer(custId);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    private Product lookUpProduct(String productId){
        return dB.findItem(productId);
    }
    
    
    
}
