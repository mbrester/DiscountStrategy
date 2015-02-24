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
    private double discountRate;
    private int minQty;

    public QtyDiscountWithPercentige(int minQty) {
        this.minQty = minQty;
    }

    public QtyDiscountWithPercentige(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }
    

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
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
