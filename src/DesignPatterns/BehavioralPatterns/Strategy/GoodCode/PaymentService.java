package DesignPatterns.BehavioralPatterns.Strategy.GoodCode;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod pm){
        this.paymentMethod = pm;
    }

    public void pay(){
        paymentMethod.makePayment();
    }
}
