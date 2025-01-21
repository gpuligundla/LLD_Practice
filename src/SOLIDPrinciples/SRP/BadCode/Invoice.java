package SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amt){
        this.amount = amt;
    }

    // functionalities
    public void generateInvoice() {
        System.out.println("Generating the invoice for the amount");
    }

    // The below functions are not the responsibility of this class. These should be maintained by other classes,
    // because if there is any error or needs changes in the below implementations it effects the Invoice class.
    public void saveTODB(){
        System.out.println("Saving the entry to the DB");
    }

    public void sendEmailNotification(){
        System.out.println("Sending an email notification to the client");
    }
}
