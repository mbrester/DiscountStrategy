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
public class LineItem {
    private int qty;
    private double runningItemTotal;
    private Product product;

    public LineItem(int qty, Product product) {
        this.qty = qty;
        this.product = product;
        setRunningItemTotal();
    }

    public LineItem() {
    }

    public double getRunningItemTotal() {
        return runningItemTotal;
    }

    private void setRunningItemTotal() {
       runningItemTotal = product.getPrice() * qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
