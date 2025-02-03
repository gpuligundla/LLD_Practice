package DesignPatterns.StructuralPatterns.Decorator.BadCode;

public class CheeseOlivePizza extends CheesePizza{

    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Olive";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
}
