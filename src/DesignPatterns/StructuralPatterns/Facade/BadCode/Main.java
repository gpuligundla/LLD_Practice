package DesignPatterns.StructuralPatterns.Facade.BadCode;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        UserService userService = new UserService();


        orderService.getOrderService(1);
        paymentService.getPaymentDetails(13435);
        userService.getUserDetails(1);
    }
}

/*
Here we are having 3 different microservices and we are tightly coupled in the client code also we are doing
multiple calls here. IF we use the facade it acts as a API Gateway and client can talk to the API Gateway.
 */