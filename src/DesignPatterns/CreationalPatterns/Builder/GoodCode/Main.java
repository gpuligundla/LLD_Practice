package DesignPatterns.CreationalPatterns.Builder.GoodCode;

public class Main {
    public static void main(String[] args) {
        HouseConstruction houseConstruction = new HouseConstruction.HouseConstructionBuilder("cement", "tiles", "roof").sethasGarden(true).sethasWindows(true).sethasPool(false).build();
        System.out.println(houseConstruction);
    }
}
