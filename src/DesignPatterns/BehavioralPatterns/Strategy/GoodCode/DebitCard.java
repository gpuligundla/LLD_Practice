package DesignPatterns.BehavioralPatterns.Strategy.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void makePayment(){
        System.out.println("Making the payment using the Debitcard");
    }
}
