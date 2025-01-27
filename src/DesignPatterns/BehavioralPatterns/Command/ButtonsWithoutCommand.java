package DesignPatterns.BehavioralPatterns.Command;

class TextEditor {
    public void bold(){
        System.out.println("Making the Text Bold");
    }
    public void italic(){
        System.out.println("Making the text itallic");
    }
    public void capitalize(){
        System.out.println("Making the text capitalize");
    }
}
class BoldButton{
    private TextEditor editor;
    public BoldButton(TextEditor editor){
        this.editor = editor;
    }
    public void click(){
        editor.bold();
    }
}
public class ButtonsWithoutCommand {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldButton boldButton = new BoldButton(textEditor);
        boldButton.click();
    }
}

/*
In this code if you see we are tightly coupling the button and text editor classes.
 */