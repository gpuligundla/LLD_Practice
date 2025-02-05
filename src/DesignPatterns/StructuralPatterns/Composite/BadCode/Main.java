package DesignPatterns.StructuralPatterns.Composite.BadCode;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1");
        File file2 = new File("File2");

        Folder folder = new Folder("Folder");
        folder.addFile(file1);
        folder.addFile(file2);

        folder.showDetails();
    }
}

/*
Here we are having 2 types of entities called file and folder. Though their structure are different. They share few
common actions like copy, move, showdetails. currently if you see There is no uniformity for these actions in client
we cant have recursive directory which contains both files and folders.

To fix it we can use composite design pattern and have a common interface for both file and folder.
 */