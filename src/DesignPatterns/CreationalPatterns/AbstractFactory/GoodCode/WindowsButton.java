package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class WindowsButton implements Button{


    @Override
    public void render() {
        System.out.println("Rendering the Windows Button");
    }
}
