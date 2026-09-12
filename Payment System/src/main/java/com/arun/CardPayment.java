package com.arun;

public class CardPayment implements Payment{
    @Override
    public void moneySend() {
        System.out.println("Money Transferred via Card");
    }
}
