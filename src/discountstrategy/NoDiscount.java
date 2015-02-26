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
public class NoDiscount implements DiscountStrategy {
   
    
    @Override
    public double getDiscountAmt(int qty, double itemPrice) {
        return 0;
    }

    @Override
    public double getDiscountedPrice(int qty, double itemPrice) {
        return itemPrice;
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void setDiscountRate(double discountRate) {
      
    }

}
