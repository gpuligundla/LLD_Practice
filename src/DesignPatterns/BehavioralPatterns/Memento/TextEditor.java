package DesignPatterns.BehavioralPatterns.Memento;

public class TextEditor {
    private String content;

    public void write(String msg){
        this.content = msg;
    }
    public String getContent(){
        return content;
    }
    public Momento save(){
        return new Momento(content);
    }
    public void restore(Momento momento){
        content = momento.getContent();
    }
}
