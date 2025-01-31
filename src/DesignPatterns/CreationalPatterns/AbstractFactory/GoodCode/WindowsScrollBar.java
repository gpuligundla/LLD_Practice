package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class WindowsScrollBar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Scrolling the Windows scroll");
    }
}
