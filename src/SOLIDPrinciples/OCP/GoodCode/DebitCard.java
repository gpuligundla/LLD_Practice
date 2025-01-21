package SOLIDPrinciples.OCP.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void pay(){
        System.out.println("Making payment using the Debitcard");
    }
}
