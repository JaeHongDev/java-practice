package com.example.javapractice.domain;

public enum OrderState {
    PAYMENT_WATING,PREPARING,SHIPPED,DELIVERING,DELIVEY_COMPLETED,CANCELED;
    PAYMENT_WAITING {
        public boolean isShippingChangeable() {
            return true;
        }
    }, PREPARING {
        public boolean isShippingChangeable() {
            return true;
        }
    }, SHIPPED, DELIVERING, DELIVERY_COMPLETED;

    public boolean isShippingChangeable() {
        return false;
    }
}
