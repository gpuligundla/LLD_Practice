package DesignPatterns.CreationalPatterns.Builder.GoodCode;

public class HouseConstruction {
    private String concrete;
    private String floor;
    private  String roof;
    private boolean hasWindows;
    private boolean hasGarden;
    private boolean hasPool;

    public HouseConstruction(HouseConstructionBuilder builder){
        this.concrete = builder.concrete;
        this.floor = builder.floor;
        this.roof = builder.roof;
        this.hasWindows = builder.hasWindows;
        this.hasGarden = builder.hasGarden;
        this.hasPool = builder.hasPool;
    }

    @Override
    public String toString() {
        return "HouseConstruction{" +
                "concrete='" + concrete + '\'' +
                ", floor='" + floor + '\'' +
                ", roof='" + roof + '\'' +
                ", hasWindows=" + hasWindows +
                ", hasGarden=" + hasGarden +
                ", hasPool=" + hasPool +
                '}';
    }

    public static class HouseConstructionBuilder{

        private String concrete;
        private String floor;
        private  String roof;
        private boolean hasWindows;
        private boolean hasGarden;
        private boolean hasPool;

        public HouseConstructionBuilder(String concrete, String floor, String roof){
            this.concrete = concrete;
            this.floor = floor;
            this.roof = roof;
        }

        public HouseConstructionBuilder sethasWindows(boolean hasWindows){
            this.hasWindows = hasWindows;
            return this;
        }
        public HouseConstructionBuilder sethasGarden(boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }
        public HouseConstructionBuilder sethasPool(boolean hasPool){
            this.hasPool = hasPool;
            return this;
        }
        public HouseConstruction build(){
            return new HouseConstruction(this);
        }
    }
}
