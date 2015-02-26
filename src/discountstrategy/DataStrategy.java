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
public interface DataStrategy {

    public abstract Customer findCustomer(String custId);

    public abstract Product findItem(String productId);
    
}
