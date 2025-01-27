package DesignPatterns.BehavioralPatterns.State.GoodCode;

public class Biking implements TransportationState{
    @Override
    public int getETA() {
        System.out.println("Calculating the ETA for biking");
        return 20;
    }

    @Override
    public String getDirections() {
        System.out.println("Finding the directions for biking");
        return "Head North 54mts";
    }
}
