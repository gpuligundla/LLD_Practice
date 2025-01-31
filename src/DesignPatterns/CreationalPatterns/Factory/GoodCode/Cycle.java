package DesignPatterns.CreationalPatterns.Factory.GoodCode;

public class Cycle implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by Cycle");
    }
}
