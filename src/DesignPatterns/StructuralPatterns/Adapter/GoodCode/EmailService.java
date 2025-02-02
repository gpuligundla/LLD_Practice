package DesignPatterns.StructuralPatterns.Adapter.GoodCode;

public class EmailService implements EmailServiceInterface {

    @Override
    public void send(String to, String title, String body) {
        System.out.println("Sending Email using inhouse email service provider");
        System.out.println("Receiver: " + to + "Title: " + title + "Body: " + body);
    }
}
