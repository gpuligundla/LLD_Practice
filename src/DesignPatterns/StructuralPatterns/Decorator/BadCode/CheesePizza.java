package DesignPatterns.StructuralPatterns.Decorator.BadCode;

public class CheesePizza extends SimplePizza{

    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
}
