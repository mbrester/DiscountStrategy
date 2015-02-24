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
public class ConsoleReceipt implements ReceiptStrategy {

    private LineItem[] lineItems;
    private double subtotal;
    private double grandtotal;
    private double totalDiscount;
    private Customer customer;
    private static final String RECEIPTITEMINFO = "Item Number     Product Name    Quantity   Original Price         Discount      SubTotal";
    private static final String STORENAME = "Kohls Department Store";
           

    @Override
    public void printReceipt() {

    }

    @Override
    public void addLineItem(LineItem lineItem) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = lineItem;
        lineItems = tempItems;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getGrandtotal() {
        return grandtotal;
    }

    public void setGrandtotal(double grandtotal) {
        this.grandtotal = grandtotal;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    

}
