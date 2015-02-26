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

    public abstract void addCustomer(Customer customer);

    public abstract Customer getCustomer();

    public abstract void setTotalDiscount(double totalDiscount);

    public abstract double getTotalDiscount();

    public abstract void setGrandTotal(double grandtotal);

    public abstract double getGrandTotal();

    public abstract void setSubTotal(double subtotal);

    public abstract double getSubTotal();

    public abstract void setLineItems(LineItem[] lineItems);

    public abstract LineItem[] getLineItems();
}
