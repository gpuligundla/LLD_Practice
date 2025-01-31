package DesignPatterns.CreationalPatterns.Factory.BadCode;

public class Car implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivery by Car");
    }
}
