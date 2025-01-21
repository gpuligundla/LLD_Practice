package SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements Notification{

    @Override
    public void send() {
        System.out.println("Sending the email.....");
    }
}
