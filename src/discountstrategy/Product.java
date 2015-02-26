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
public class Product {

    private String productId;
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product() {
    }

    public Product(String productId, String name, double price, DiscountStrategy discountStrategy) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getDiscountAmt(int qty) {
        return discountStrategy.getDiscountAmt(qty, price);

    }

    public double getDiscountedPrice(int qty) {
        return discountStrategy.getDiscountedPrice(qty, price);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product Id cannot be null or empty");
        }
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product Name cannot be null or empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price = price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
