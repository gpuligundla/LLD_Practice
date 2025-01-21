package SOLIDPrinciples.OCP.GoodCode;

public class Wallet implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Making the payment using the wallet");
    }
}
