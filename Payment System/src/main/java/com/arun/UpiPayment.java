package com.arun;

public class UpiPayment implements Payment {
    @Override
    public void moneySend() {
        System.out.println("Money Transferred via Upi");
    }
}
