package DesignPatterns.StructuralPatterns.Composite.BadCode;

public class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Showing the details of File: " + name);
    }
}
