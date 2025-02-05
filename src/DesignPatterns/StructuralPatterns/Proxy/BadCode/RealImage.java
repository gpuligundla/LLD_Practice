package DesignPatterns.StructuralPatterns.Proxy.BadCode;

import java.security.PublicKey;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String name){
        this.fileName = name;
        loadImage();
    }
    private void loadImage(){
        System.out.println("Loading the image from Disk" + fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying the image");
    }
}
