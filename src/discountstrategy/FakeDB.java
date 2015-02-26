/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Mitch
 */
public class FakeDB implements DataStrategy {

    private final Product[] products = {
        new Product("111", "Hat ", 5.00, new PercentOffDiscount(.15)),
        new Product("112", "T-Shirt", 10.00, new FlatRateDiscount(5)),
        new Product("113", "Tree", 25.00, new NoDiscount())
    };
    private Product product = null;

    @Override
    public Product findItem(String productId) {
        for (Product product1 : products) {
            if (productId.equals(product1.getProductId())) {
                product = product1;

            }
        }
        if (product == null) {
            throw new IllegalArgumentException("Can not find product");
        } else {
            return product;
        }
    }

    private Customer[] customers = {
        new Customer("aaa", "Bob Brian"),
        new Customer("bbb", "Tom McGee"),
        new Customer("ccc", "Rob Robertson")
    };
    private Customer customer = null;

    @Override
    public Customer findCustomer(String custId) {
        for (Customer customer1 : customers) {
            if (custId.equals(customer1.getCustId())) {
                customer = customer1;
            }

        }
        if (customer == null) {
            throw new IllegalArgumentException("Can not find customer.");
        } else {
            return customer;
        }
    }
}
