package DesignPatterns.BehavioralPatterns.State.GoodCode;

public class TransportationService {
    private TransportationState transportationState;

    public TransportationService(TransportationState state){
        this.transportationState = state;
    }

    public int getETA(){
        return transportationState.getETA();
    }

    public String getDirections(){
        return transportationState.getDirections();
    }
}
