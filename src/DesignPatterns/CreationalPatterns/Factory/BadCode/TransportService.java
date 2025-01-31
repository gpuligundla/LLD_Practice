package DesignPatterns.CreationalPatterns.Factory.BadCode;

public class TransportService {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bike = new Bike();
        Transport cycle = new Cycle();

        car.deliver();
    }
}

/*
Here if you observe, in the client code we are handling the responsibility of creating the objects of Transport
interface and using which ever is necessary. It is making our code more tight couple. Instead if we try to introduce
factory design pattern. it will delegate this work to the intermediate class.
 */