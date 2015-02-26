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
public interface DiscountStrategy {
    public abstract double getDiscountAmt(int qty, double itemPrice);
    public abstract double getDiscountedPrice(int qty, double itemPrice);
    public abstract double getDiscountRate();
    public abstract void setDiscountRate(double discountRate);
}
