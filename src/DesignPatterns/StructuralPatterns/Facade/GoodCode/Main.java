package DesignPatterns.StructuralPatterns.Facade.GoodCode;

public class Main {
    public static void main(String[] args) {
        APIGateway apiGateway = new APIGateway();

        apiGateway.getFullDetails(1, 124, 1);
    }
}

/*
After implementing the pattern the client code has been simplified. It does only one call to the API Gateway. The code
is simplified and client no need to worry about the maintenance of the microservice calls.
 */