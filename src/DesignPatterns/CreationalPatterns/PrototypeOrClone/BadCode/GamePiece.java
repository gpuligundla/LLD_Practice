package DesignPatterns.CreationalPatterns.PrototypeOrClone.BadCode;

public class GamePiece {
    private String color;
    private  int position;

    public GamePiece(String color, int pos){
        this.color = color;
        this.position = pos;
    }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
