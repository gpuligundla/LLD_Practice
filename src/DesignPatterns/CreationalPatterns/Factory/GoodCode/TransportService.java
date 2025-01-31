package DesignPatterns.CreationalPatterns.Factory.GoodCode;

public class TransportService {
    public static void main(String[] args) {
        Transport vechicle = TransportFactory.createTransport("car");
        vechicle.deliver();
    }
}

/*
Now the client code doesn't need to manage all the object lifecycles of the library code. Factory class acts as an
wrapper in betweeen which gives us respective object based on our type request.
 */