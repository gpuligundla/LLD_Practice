package DesignPatterns.StructuralPatterns.Flyweight.BadCode;

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
If you see here we are having multiple objects holding the common data like color. if real life examples it can be
any big file like image. so in memory intensive projects like games where we load an object multiple times. it will
take up lot of space.


we can fix it with flyweight pattern where we create a common things once and refernce all the objects to the same
memory location. so that we save lot of space

 */