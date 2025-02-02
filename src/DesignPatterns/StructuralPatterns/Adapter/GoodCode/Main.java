package DesignPatterns.StructuralPatterns.Adapter.GoodCode;

public class Main {
    public static void main(String[] args) {
        EmailServiceInterface emailService = new EmailService();

        emailService.send("gk@protonmail.com", "sampe", "Hello World!!");


        EmailServiceInterface extEmailService1 = new ExternalEmailServiceAdapter(new ExternalEmailService());

        extEmailService1.send("gk@protonmail.com", "sampe", "Hello World!!");
    }
}

/*
We have introduced a intermediate new class called adaptor which converts the legacy calls to work with
new classes/interfaces.

It will be really helpful in large legacy codebases.
 */