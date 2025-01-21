package oops;

public class UPI implements PaymentMethod{
    String upiId;
    public UPI(String id){
        this.upiId = id;
        System.out.println("New oops.UPI object is created");
    }

    @Override
    public void pay() {
        System.out.println("Making payment using the oops.UPI "+ upiId);
    }
}
