package DesignPatterns.BehavioralPatterns.State.GoodCode;

public class Main {
    public static void main(String[] args) {
        TransportationService transportationService = new TransportationService(new Walking());
        System.out.println(transportationService.getETA());
        System.out.println(transportationService.getDirections());
    }
}
/*
Here we have implemented the state pattern where we have the state interface from which we have implemented
the different states. along with these 2 things we have a context class which is transportationservice which holds the
reference to the concrete transportation state and return the eta and directions .
 */