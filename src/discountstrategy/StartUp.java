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
public class StartUp {

    public static void main(String[] args) {

        Register register = new Register(new ConsoleReceipt(), new FakeDB());
        register.startSale("aaa");
        register.addProduct("111", 2);
        register.addProduct("113", 1);
        register.endSale();
        
        
        
    }
}
