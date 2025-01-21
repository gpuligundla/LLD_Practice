package oops;

public abstract class Card implements PaymentMethod{
    private final String cardNo;
    private final String userName;

    public Card(String cn, String name){
        this.cardNo = cn;
        this.userName = name;
    }
    public String getCardNo() {
        return cardNo;
    }
    public String getUserName() {
        return userName;
    }
}
