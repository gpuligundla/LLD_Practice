package DesignPatterns.StructuralPatterns.Facade.GoodCode;

public class APIGateway {
    OrderService orderService;
    PaymentService paymentService;
    UserService userService;

    public APIGateway(){
        orderService = new OrderService();
        paymentService = new PaymentService();
        userService = new UserService();
    }

    public void getFullDetails(int orderID, int payID, int userID){
        orderService.getOrderService(orderID);
        paymentService.getPaymentDetails(payID);
        userService.getUserDetails(userID);
    }
}
