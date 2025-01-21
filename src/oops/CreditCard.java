package oops;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String userName){
        super(cardNo, userName);
        System.out.println("New creditcard object is created");
    }
    @Override
    public void pay(){
        System.out.println("Making payment using creditcard "+ getCardNo());
    }
}
