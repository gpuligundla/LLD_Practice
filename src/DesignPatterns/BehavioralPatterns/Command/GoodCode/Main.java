package DesignPatterns.BehavioralPatterns.Command.GoodCode;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();


    }
}
