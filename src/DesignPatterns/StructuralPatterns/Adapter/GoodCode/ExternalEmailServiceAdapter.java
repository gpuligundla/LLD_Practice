package DesignPatterns.StructuralPatterns.Adapter.GoodCode;

public class ExternalEmailServiceAdapter implements EmailServiceInterface{

    private ExternalEmailService emailService;

    public ExternalEmailServiceAdapter(ExternalEmailService emailService){
        this.emailService = emailService;
    }


    @Override
    public void send(String to, String title, String body) {
        System.out.println("using Adaptor pattern to work with exisitng interface");
        emailService.sendEmail(to, title, body);
    }
}
