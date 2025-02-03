package DesignPatterns.StructuralPatterns.Decorator.BadCode;

public class CheeseOliveMushroomPizza extends CheeseOlivePizza{
    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Mushroom";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.00;
    }
}
