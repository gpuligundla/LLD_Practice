package DesignPatterns.StructuralPatterns.Decorator.GoodCode;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}
