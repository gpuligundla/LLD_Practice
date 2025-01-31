package DesignPatterns.CreationalPatterns.AbstractFactory.GoodCode;

public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollBar();
    }

    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);

        app.renderUI();
    }
}

/*
Here we have grouped everything i.e we started with abstract products like buttons & scrollbars. For these we created
the interfaces and implemented the contract for windows and macos.

Later we grouped them into next higher layer with a interface called UIFactory. we again implemented the contract
for windows and macos and these concrete implementations use the above respective concrete abstract products.

In the client code, we maintain the state of these abstract products and in the constructor we set the respective family
and use the actions of it.
 */