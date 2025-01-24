package DesignPatterns.BehavioralPatterns.Template.GoodCode;

public abstract class Parser {
    public void readFile(){
        System.out.println("Reading the file .....");
    }
    public void writeFile(){
        System.out.println("Writing the file.....");
    }
    public void doParse(){
        readFile();
        parse();
        writeFile();
    }
    protected abstract void parse();
}
