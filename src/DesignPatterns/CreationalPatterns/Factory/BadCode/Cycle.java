package DesignPatterns.CreationalPatterns.Factory.BadCode;

public class Cycle implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by Cycle");
    }
}
