package DesignPatterns.CreationalPatterns.Factory.BadCode;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by Bike");
    }
}
