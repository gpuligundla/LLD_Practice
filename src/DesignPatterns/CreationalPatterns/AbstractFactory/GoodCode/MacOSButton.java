package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering the MacOS Button");
    }
}
