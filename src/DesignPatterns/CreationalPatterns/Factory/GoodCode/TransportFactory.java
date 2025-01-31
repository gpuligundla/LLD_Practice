package DesignPatterns.CreationalPatterns.Factory.GoodCode;

public class TransportFactory {
    public static Transport createTransport(String type){
        switch (type){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "cycle":
                return new Cycle();
            case null, default:
                throw new IllegalArgumentException();
        }
    }
}
