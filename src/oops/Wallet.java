package oops;

public class Wallet implements PaymentMethod{
    String walletId;
    public Wallet(String id){
        this.walletId = id;
        System.out.println("New wallet object is created");
    }

    @Override
    public void pay() {
        System.out.println("Making payment using the oops.Wallet "+ walletId);
    }
}
