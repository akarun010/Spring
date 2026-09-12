package com.arun;


public class PaymentService {
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void paymentDetails() {
        payment.moneySend();
    }
}
