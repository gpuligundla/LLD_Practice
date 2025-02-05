package DesignPatterns.StructuralPatterns.Proxy.GoodCode;

public class Main {
    public static void main(String[] args) {
        Image newImage = new ProxyImage("Clemson");

        newImage.display();

        Image otherImage = new ProxyImage("downtown");

    }
}

/*
Here we have used the proxy pattern to delagate the object to the surrogate object. now in the client when we create
the object it doesn't load the fiel into the memory. instead when we call the display method it checks whether we
have the real object loaded or not (cache). if available, we call it else we create a new object now and call the
display method.
 */