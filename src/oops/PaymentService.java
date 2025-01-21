package oops;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentmethods;

    public PaymentService(){
        paymentmethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        paymentmethods.put(name, pm);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentmethods.get(name);
        pm.pay();
    }
}

