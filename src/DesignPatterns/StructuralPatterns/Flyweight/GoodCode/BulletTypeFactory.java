package DesignPatterns.StructuralPatterns.Flyweight.GoodCode;

import java.util.HashMap;

public class BulletTypeFactory {
    private static final HashMap<String, BulletType> bullets = new HashMap<>();

    public static BulletType getColor(String color){
        if(!bullets.containsKey(color)) {
            bullets.put(color, new BulletType(color));
        }
            return bullets.get(color);
    }
}
