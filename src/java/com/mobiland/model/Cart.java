
package com.mobiland.model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author shibo
 */

public class Cart implements Serializable {

    private Date time;
    
    private int quantity;
   
    private Customer customer;
   
    private Product product;
     
    private boolean bought;

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public Cart() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart(Date time, int quantity, Customer customer, Product product, boolean bought) {
        this.time = time;
        this.quantity = quantity;
        this.customer = customer;
        this.product = product;
        this.bought = bought;
    }

    
}