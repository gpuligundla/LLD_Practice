package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class MacOSScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Scrolling the MacOs scroll");
    }
}
