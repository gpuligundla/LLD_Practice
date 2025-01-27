package DesignPatterns.BehavioralPatterns.Command.GoodCode;

public class ItallicCommand implements Command{
    private TextEditor editor;

    public ItallicCommand(TextEditor editor){
        this.editor = editor;
    }

    @Override
    public void execute(){
        editor.itallic();
    }
}
