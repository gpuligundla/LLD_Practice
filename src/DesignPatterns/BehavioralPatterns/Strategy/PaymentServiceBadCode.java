package DesignPatterns.BehavioralPatterns.Strategy;

class PaymentService {
    public void processPayment(String type){
        if(type.equals("CC")){
            System.out.println("Making payment using CC");
        } else if (type.equals("DC")) {
            System.out.println("Making payment using Debit");
        }
        else{
            System.out.println("Making payement using UPI");
        }
    }
}
public class PaymentServiceBadCode {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CC");
    }
}

/*
Here we are trying to implement an payment service which needs to work for all types. here if you see we are tightly
coupled in the PaymentService class. If we need to modify/add new payment service we need to change the implementation
which violates the open/close principle.

Now lets use strategy design pattern to solve this.
 */