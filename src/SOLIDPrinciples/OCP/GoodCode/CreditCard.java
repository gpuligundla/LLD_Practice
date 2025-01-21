package SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(){
        System.out.println("Making the payment using the Creditcard");
    }
}
