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
public class FlatRateDiscount implements DiscountStrategy {
    
    private double discountRate;

    public FlatRateDiscount() {
    }

    public FlatRateDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    

    @Override
    public double getDiscountAmt(int qty, double itemPrice) {
        return itemPrice * qty * discountRate;
    }

    @Override
    public double getDiscountedPrice(int qty, double itemPrice) {
        return itemPrice * qty - getDiscountAmt(qty, itemPrice);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}