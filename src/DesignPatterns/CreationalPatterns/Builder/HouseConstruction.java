package DesignPatterns.CreationalPatterns.Builder;

class HouseItems {
    private String concrete;
    private String floor;
    private  String roof;
    private boolean hasWindows;
    private boolean hasGarden;
    private boolean hasPool;

    public HouseItems(String concrete, String floor, String roof, boolean hasWindows, boolean hasGarden, boolean hasPool){
        this.concrete = concrete;
        this.floor = floor;
        this.roof = roof;
        this.hasWindows = hasWindows;
        this.hasGarden = hasGarden;
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "HouseItems{" +
                "concrete='" + concrete + '\'' +
                ", floor='" + floor + '\'' +
                ", roof='" + roof + '\'' +
                ", hasWindows=" + hasWindows +
                ", hasGarden=" + hasGarden +
                ", hasPool=" + hasPool +
                '}';
    }
}
public class HouseConstruction {
    public static void main(String[] args) {
        HouseItems houseItems = new HouseItems("cement", "tiles", "slab", true, false, false);
        System.out.println(houseItems);
    }
}

/*
 If you see here there are few mandatory and optional parameters in the Houseitems class. if we are using like this
 directly it leads to lot of complex maintanence. instead if we have builder pattern, we can wrap all the optional
 parameters into methods.
 */
