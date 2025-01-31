package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}
