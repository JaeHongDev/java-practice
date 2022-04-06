package com.example.javapractice.domain;

import java.util.stream.IntStream;

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }
    public Money add(Money money){
        return new Money(this.value + money.value);
    }

    public Money multiply(int multipplier){
        return new Money(value * multipplier);
    }
}
