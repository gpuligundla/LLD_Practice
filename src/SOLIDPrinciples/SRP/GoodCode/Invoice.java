package SOLIDPrinciples.SRP.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amt){
        this.amount = amt;
    }

    public void generateInvoice(){
        System.out.println("Generating the invoice for the amount");
    }
}
