package DesignPatterns.CreationalPatterns.Factory.GoodCode;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by Bike");
    }
}
