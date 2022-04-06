package com.example.javapractice.domain;

public class OrderLine {
    private Product product;
    private int     quantity;
    private int     amounts;
    private Money price;

    public OrderLine(Product product, int quantity,Money price) {
        this.product  = product;
        //this.price    = price;
        this.price = new Money(price.getValue());
        this.quantity = quantity;
        this.amounts  = calculateAmounts();
    }

    private int calculateAmounts() {
        return price * quantity;
    }

    public int getAmounts() {
        return amounts;
    }
}
