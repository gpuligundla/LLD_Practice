package oops;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String userName){
        super(cardNo, userName);
        System.out.println("New Debitcard object is created");
    }

    @Override
    public void pay(){
        System.out.println("Making payment using the Debitcard "+ getCardNo());
    }
}
