package SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    private String txnID;

    public PaymentProcessor(String id){
        this.txnID = id;
    }
    public void processPayment(PaymentMethod pm){
        pm.pay();
    }
}

// Here now we have removed the dependency and all works with the interface PaymentMethod. so even in future if we need
// to add a new payment type we add a new class for it and implements the PaymentMethod. In the PaymentProcessor,
// instead of passing the type of payment as we did in the badcode, here we pass the object from the driver code which
// automatically invokes the respective paymentmethod overridden function. It is also an example of runtime polymorphism