package DesignPatterns.BehavioralPatterns.Strategy.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService= new PaymentService();
        paymentService.setPaymentMethod(new UPI());
        paymentService.pay();
    }
}

/*
Here we have implemented the strategy pattern
This works by creating an interface for paymenttypes and implementing them for different payment methods.
Later in the paymentservice we set the paymentmethod by passing the specifc paymentmethod object and we also have the
pay() method in the paymentservice which indirectly calls the concrete class of paymentmethod in runtime and make the
payment.
 */