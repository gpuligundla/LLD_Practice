package SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notificationobj){
        this.notification = notificationobj;
    }

    public void sendNotification(){
        notification.send();
    }
}

// Now everything is associated with interface Notification. Which satisfies the Dependency inversion principle. In the
// badcode if you see we are depending on the concrete classes email and sms service. now we reversed the dependency
// by making all concrete classes depend on the notification interface.