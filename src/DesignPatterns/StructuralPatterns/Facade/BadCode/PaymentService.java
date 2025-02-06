package DesignPatterns.StructuralPatterns.Facade.BadCode;

public class PaymentService {
    public void getPaymentDetails(int payID){
        System.out.println("Printing the payment details: "+payID);
    }
}
