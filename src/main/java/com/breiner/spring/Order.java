package com.breiner.spring;

import com.fasterxml.jackson.annotation.JsonProperty;

//poos plain old java objects
public class Order {

    @JsonProperty("c-name")
    private String customerName;

    @JsonProperty("p-name")
    private String productName;

    @JsonProperty("quantity")
    private int quantity;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    //Order class
    //if didn't created the accesors(getter, setter) the answer still is null
    public String toString(){
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ",productName='" + productName + '\'' +
                ",quantity='" + quantity +
                '}';

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
