package DesignPatterns.BehavioralPatterns.State.GoodCode;

public class Cycling implements TransportationState{
    @Override
    public int getETA() {
        System.out.println("Calculating the ETA for cycling");
        return 15;
    }

    @Override
    public String getDirections() {
        System.out.println("Finding the directions for cycling");
        return "Head East 44mts";
    }
}
