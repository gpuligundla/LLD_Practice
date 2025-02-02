package DesignPatterns.StructuralPatterns.Adapter.GoodCode;

public class ExternalEmailService {
    public void sendEmail(String recipient, String subject, String message){
        System.out.println("Sending email using the external email service");
        System.out.println("Recipient: "+ recipient + "subject: " + subject + "Message: " + message);
    }
}
