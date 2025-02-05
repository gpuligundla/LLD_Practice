package DesignPatterns.StructuralPatterns.Composite.BadCode;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files = new ArrayList<File>();

    public Folder(String name){
        this.name = name;
    }

    public void addFile(File f){
        files.add(f);
    }
    public void showDetails(){
        System.out.println("Showing the folder: "+ name);
        for(File file: files){
            file.showDetails();
        }
    }
}
