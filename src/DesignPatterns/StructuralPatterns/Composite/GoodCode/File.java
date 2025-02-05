package DesignPatterns.StructuralPatterns.Composite.GoodCode;

public class File implements FileSystemComponent{
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Showing the details of File: " + name);
    }
}
