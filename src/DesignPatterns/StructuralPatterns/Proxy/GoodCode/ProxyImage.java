package DesignPatterns.StructuralPatterns.Proxy.GoodCode;

public class ProxyImage implements Image{

    private String filename;
    private Image realImage;

    public ProxyImage(String name){
        this.filename = name;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
