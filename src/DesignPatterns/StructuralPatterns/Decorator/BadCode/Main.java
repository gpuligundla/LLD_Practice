package DesignPatterns.StructuralPatterns.Decorator.BadCode;

public class Main {
    public static void main(String[] args) {
        Pizza simplePizza = new SimplePizza();
        System.out.println(simplePizza.getDescription());
        System.out.println(simplePizza.getPrice());

        Pizza toppingsPizza = new CheeseOliveMushroomPizza();
        System.out.println(toppingsPizza.getDescription());
        System.out.println(toppingsPizza.getPrice());
    }
}

/*
Here we are having a simple pizza which is extended to add toppings to it. here we are having 2 choices for each
toppings. i.e pick and not pick. A customer can ask for any combination of toppings so if we have N toppings, then
we need to have 2^N sub classes inherited from simplePizza.

This makes classes so big and causes explosion. To fix it we use Decorator Pattern
 */