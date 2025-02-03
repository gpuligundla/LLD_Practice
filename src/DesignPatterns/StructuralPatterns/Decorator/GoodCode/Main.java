package DesignPatterns.StructuralPatterns.Decorator.GoodCode;

public class Main {
    public static void main(String[] args) {
        Pizza simplePizza = new SimplePizza();
        Pizza cheesePizza = new CheeseDecorator(simplePizza);
        Pizza cheeseOlivePizza = new OliveDecorator(cheesePizza);

        System.out.println(simplePizza.getDescription());
        System.out.println(simplePizza.getPrice());

        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getPrice());

        System.out.println(cheeseOlivePizza.getDescription());
        System.out.println(cheeseOlivePizza.getPrice());
    }
}

/*
Here we have used the decorator pattern to remove the coupling between toppings. Now we can have mix any type of
toppings without creating multiple sub classes.
 */