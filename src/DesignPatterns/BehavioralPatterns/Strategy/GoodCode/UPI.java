package DesignPatterns.BehavioralPatterns.Strategy.GoodCode;

public class UPI implements PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("Making the payment using the UPI");
    }
}
