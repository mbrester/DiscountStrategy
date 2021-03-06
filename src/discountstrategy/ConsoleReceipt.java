/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.util.Date;

/**
 *
 * @author mbrester1
 */
public class ConsoleReceipt implements ReceiptStrategy {

    private LineItem[] lineItems = {};
    private double subTotal;
    private double grandTotal;
    private double totalDiscount;
    private Customer customer;
    private static final String RECEIPTITEMINFO = "Item Number     Product Name    Quantity   Original Price      Discount      SubTotal";
    private static final String STORENAME = "Kohls Department Store";
    private Date date = new Date();
    private DataStrategy dB;

    public ConsoleReceipt(DataStrategy dB) {
        this.dB = dB;
    }

   
 
    
    
    @Override
    public void printReceipt() {
        System.out.println(date.toString());
        System.out.println(customer.getName() + "  Customer ID: " + customer.getCustId());
        System.out.println(STORENAME);
        System.out.println(RECEIPTITEMINFO);
        System.out.println("________________________________________________________________________________________");
        System.out.println("");
        for (LineItem lineItem : lineItems) {
            subTotal += lineItem.getRunningItemTotal();

            System.out.format(lineItem.getItemId() + "\t            " + lineItem.getItemName()
                    + "\t   " + lineItem.getQty() + "\t       $" + lineItem.getItemPrice() + "\t\t$-"
                    + lineItem.getTotalDiscount() + "\t\t$"  + subTotal);
            totalDiscount += lineItem.getTotalDiscount();
            System.out.println("");
        }
        grandTotal = subTotal;
        System.out.println("________________________________________________________________________________________");
        System.out.println("                                                        You Saved: $" + totalDiscount);
        System.out.println("                                                      Grand Total: $" + grandTotal);
    }

    @Override
    public void addItemToArray(LineItem lineItem) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = lineItem;
        lineItems = tempItems;
    }

    @Override
    public LineItem[] getLineItems() {
        return lineItems;
    }

    @Override
    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public double getSubTotal() {
        return subTotal;
    }

    @Override
    public void setSubTotal(double subtotal) {
        this.subTotal = subtotal;
    }

    @Override
    public double getGrandTotal() {
        return grandTotal;
    }

    @Override
    public void setGrandTotal(double grandtotal) {
        this.grandTotal = grandtotal;
    }

    @Override
    public double getTotalDiscount() {
        return totalDiscount;
    }

    @Override
    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void addCustomer(String custId) {
        this.customer = lookUpCustomer(custId);
    }
    private Customer lookUpCustomer(String custId) {
        return dB.findCustomer(custId);
    }
    private Product lookUpProduct(String productId){
        return dB.findItem(productId);
    }

    @Override
    public void addLineItem(String productId, int qty) {
         LineItem temp = new LineItem(lookUpProduct(productId),qty);
         addItemToArray(temp);
                 
         
    }

}
