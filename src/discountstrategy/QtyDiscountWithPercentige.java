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
public class QtyDiscountWithPercentige implements DiscountStrategy {
    private double discountRate = .15;
    private int minQty;

    public QtyDiscountWithPercentige(int minQty) {
        this.minQty = minQty;
    }

    public QtyDiscountWithPercentige(double discountRate, int minQty) {
        setDiscountRate(discountRate);
        this.minQty = minQty;
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
 

   

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    @Override
    public double getDiscountAmt(int qty, double itemPrice) {
        if(qty >= minQty){
            return itemPrice * discountRate * qty;
        }else{
            return 0;
        }
        
    }

    @Override
    public double getDiscountedPrice(int qty, double itemPrice) {
        return itemPrice * qty - getDiscountAmt(qty,itemPrice);
    }


   

    
    
    
}
