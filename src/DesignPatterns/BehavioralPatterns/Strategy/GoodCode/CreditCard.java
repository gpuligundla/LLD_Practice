package DesignPatterns.BehavioralPatterns.Strategy.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("Making the payment using the Creditcard");
    }
}
