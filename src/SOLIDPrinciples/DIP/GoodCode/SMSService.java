package SOLIDPrinciples.DIP.GoodCode;

public class SMSService implements Notification{
    @Override
    public void send() {
        System.out.println("Sending the SMS.......");
    }
}
