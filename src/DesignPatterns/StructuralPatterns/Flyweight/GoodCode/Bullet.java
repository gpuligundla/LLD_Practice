package DesignPatterns.StructuralPatterns.Flyweight.GoodCode;

public class Bullet {
    private BulletType color;

    private int x;
    private  int y;
    private int velocity;

    public Bullet(int x, int y, int velocity, String color){
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.color = BulletTypeFactory.getColor(color);
    }

    public void getBulletDetails(){
        System.out.println("Bullet of color: "+ color + " is at the coordinates (" + x +", " + y + ") with velocity:" + velocity);
    }
}
