package DesignPatterns.CreationalPatterns.AbstractFactory;

class WindowsButton{
    public void render(){
        System.out.println("Rendering the windows button");
    }
}

class WindowsScrollBar{
    public void scroll(){
        System.out.println("Scrolling the windows scrollbar");
    }
}

class MacOSButton{
    public void render(){
        System.out.println("Rendering the MacOs button");
    }
}

class MacOSScrollBar{
    public void scroll(){
        System.out.println("Scrolling the Macos scrollbar");
    }
}

public class WindowsMacUIBadCode {
    public static void main(String[] args) {
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();

        windowsButton.render();
        windowsScrollBar.scroll();
    }
}

/*
Here we have family of UI actions for each os. if you see in the above client code, we are tightly coupled with
specific type of UI family actions. if we need to change we need to modify the code.

we can use abstract factory pattern to fix it.
 */
