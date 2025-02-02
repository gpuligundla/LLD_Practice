package DesignPatterns.StructuralPatterns.Adapter.BadCode;

public class Main {
    public static void main(String[] args) {
        EmailServiceInterface emailService = new EmailService();

        emailService.send("gk@protonmail.com", "sampe", "Hello World!!");


        // EmailServiceInterface extEmailService = new ExternalEmailService();
    }
}

/*
Here the problem is we are using the in house legacy emailservice to send emails to the clients. Now we want to
integrate a new external service to send emails. The problem is we need to refactor lot of code to work with new
classes/interfaces. It takes lot of time and testing.

Instead we can use the adapter pattern and solve it.
 */