package DesignPatterns.BehavioralPatterns.State;

enum TransportationMode {
    WALIKING, CYCLING,  BIKING
}

class TransportationService {
    private TransportationMode transportationMode;

    public TransportationService(TransportationMode mode){
        this.transportationMode = mode;
    }

    public void setTransportationMode(TransportationMode mode){
        this.transportationMode = mode;
    }

    public int getETA(){
        return switch (transportationMode) {
            case WALIKING -> {
                System.out.println("calcualting ETA for Walking");
                yield 10;
            }
            case BIKING -> {
                System.out.println("calculating ETA for Biking");
                yield 20;
            }
            case CYCLING -> {
                System.out.println("calculating ETA for cycling");
                yield 30;
            }
            case null, default -> 0;
        };
    }

    public String getDirection(){
        return switch (transportationMode) {
            case WALIKING -> "walk in the north for 100 mts";
            case CYCLING -> "cycle for 500mts";
            case BIKING -> "ride for 1km";
            case null, default -> "try again";
        };
    }
}

public class TransportationWithoutState {
    public static void main(String[] args) {
        TransportationService transportationService = new TransportationService(TransportationMode.WALIKING);
        transportationService.setTransportationMode(TransportationMode.CYCLING);
        System.out.println(transportationService.getDirection());
        transportationService.getETA();
    }
}

/*
In this if you see we are having the tight coupling between the enums and the tranportation service. We modify the enums
we also need to change the switch cases. It is violation of open/close principle, and we need to fix it.

It's also causing code duplicate in the ETA, direction methods
 */