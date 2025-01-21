package SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {
    private String txnID;

    public PaymentProcessor(String id){
        this.txnID = id;
    }

    // if you see here everything is tightly coupled, lets say you want to add a new payment type in the future, you need to
    // change the business logic here and also the unit testcases associated with it. instead we should use open/close
    // principle where we should not allow modification and only allow to extend. so lets change this solution by making
    // different payment types into its own class and all these classes will have a common interface called payment method

    public void processPayment(String type){
        if(type.equals("creditcard")){
            System.out.println("Making payment using the creditcard");
        }
        if(type.equals("debitcard")){
            System.out.println("Making payment using the debitcard");
        }
        if(type.equals("wallet")){
            System.out.println("Making payment using the wallet");
        }
    }
}
