package DesignPatterns.StructuralPatterns.Proxy.BadCode;

public class Main {
    public static void main(String[] args) {
        Image newImage = new RealImage("Clemson");

        newImage.display();

        Image otherImage = new RealImage("downtown");

    }
}

/*
Here we are loading 2 images. The current logic loads the image into the disk when constructor is called, sometimes we
dont display the image and just create the constructor. Here the otherImage is just created but if you see the logic.
we loaded the image into the memory. it is causing waste of resources.


TO fix it we can use proxy pattern, where we can use surrogate objects to delay the expensive operations.
 */