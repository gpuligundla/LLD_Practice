package DesignPatterns.StructuralPatterns.Decorator.GoodCode;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " Adding Cheese";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 1.00;
    }
}
