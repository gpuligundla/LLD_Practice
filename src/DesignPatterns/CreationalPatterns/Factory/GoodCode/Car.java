package DesignPatterns.CreationalPatterns.Factory.GoodCode;

public class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivery by Car");
    }
}
