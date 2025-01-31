package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
