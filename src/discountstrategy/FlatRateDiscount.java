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
    
    private double discountRate = .2;

    public FlatRateDiscount() {
    }

    public FlatRateDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    

    @Override
    public double getDiscountAmt(int qty, double itemPrice) {
        return itemPrice * qty * discountRate;
    }

    @Override
    public double getDiscountedPrice(int qty, double itemPrice) {
        return itemPrice * qty - getDiscountAmt(qty, itemPrice);
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        if(discountRate<0 || discountRate>1){
            throw new IllegalArgumentException("Dicsount rate can not be less than 0 or greater than 1.");
        }
        this.discountRate = discountRate;
    }
    
}
