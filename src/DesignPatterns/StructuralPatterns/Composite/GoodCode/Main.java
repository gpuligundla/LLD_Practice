package DesignPatterns.StructuralPatterns.Composite.GoodCode;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1");
        FileSystemComponent file2 = new File("File2");

        Folder rootDir = new Folder("Root");
        rootDir.addComponent(file1);
        rootDir.addComponent(file2);

        Folder subDir = new Folder("subDir");
        FileSystemComponent file3 = new File("File3");

        subDir.addComponent(file3);

        rootDir.addComponent(subDir);


        rootDir.showDetails();

    }
}

/*
 In this solution we have implemented the composite design pattern. Now we have a common interface between file and
 folder such that they have same contract from the client


 This will be helpful because now we can have recursive directories where a folder can contain files and other subdir's
 which contains nested files.
 */