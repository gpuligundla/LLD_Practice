package oops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("GKDebit", new DebitCard("1234", "GK"));
        ps.addPaymentMethod("GKCredit", new CreditCard("fdf344", "GK"));
        ps.addPaymentMethod("GKUPI", new UPI("upiupiupi"));
        ps.addPaymentMethod("GKApplewallet", new Wallet("AppleidAppleid"));

        ps.makePayment("GKUPI");
        ps.makePayment("GKCredit");
    }
}