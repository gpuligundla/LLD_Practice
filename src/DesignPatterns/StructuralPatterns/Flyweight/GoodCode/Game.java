package DesignPatterns.StructuralPatterns.Flyweight.GoodCode;

public class Game {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            Bullet b = new Bullet(10*i, 20*i, 11*i, "Red");
            b.getBulletDetails();
        }

        for(int i = 0; i < 5; i++){
            Bullet b = new Bullet(10*i, 20*i, 11*i, "Green");
            b.getBulletDetails();
        }
    }
}

/*
Now we have used the flyweight pattern to save the space and used the same memory for all the objects.


This is done by separating the common things and unique things for each object and moved the common things into a
 another class. Along with it to maintain the map of common objects we use factory pattern to maintain its list and
 lifecycle. To sum up when a object is created it creates with a new memory space for all the unique objects and for
 the common items it allocates the memory once and uses it for all the objects it needed.

 Intrinsic and Extrinsic Objects

 */