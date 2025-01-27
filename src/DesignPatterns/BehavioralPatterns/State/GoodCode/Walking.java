package DesignPatterns.BehavioralPatterns.State.GoodCode;

public class Walking implements TransportationState{

    @Override
    public int getETA() {
        System.out.println("Calculating the ETA for walking");
        return 10;
    }

    @Override
    public String getDirections() {
        System.out.println("Finding the directions for walking");
        return "Head North 10mts";
    }
}
