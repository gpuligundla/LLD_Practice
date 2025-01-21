package SOLIDPrinciples.DIP.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(){
        emailService.sendEmail("message");
    }
    public void notifyBySMS(){
        smsService.sendSMS("message");
    }
}

// If you observe here notification service class is dependent on emailservice and smsservice class to perform the
// actions. which is violation of Dependency inversion principle because it directly depends on the concrete classes,
// if in future if we need to add new type of notification service we need to modify the code also it is tightly coupled
// if any changes are made in the emailserivce or smsservice it effects the notificationservice. instead to fix this,
// all classes should depend on abstractions instead of concrete classes.