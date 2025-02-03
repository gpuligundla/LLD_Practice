package DesignPatterns.StructuralPatterns.Decorator.GoodCode;

public class SimplePizza implements Pizza {

    @Override
    public String getDescription() {
        return "This is a simple Pizza...";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}
