package DesignPatterns.StructuralPatterns.Composite.GoodCode;

import java.util.ArrayList;
import java.util.List;
public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> folder = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        folder.add(component);
    }

    public void showDetails(){
        System.out.println("Showing details of a folder: "+ name);
        for(FileSystemComponent component: folder){
            component.showDetails();
        }
    }
}
