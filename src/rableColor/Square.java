package rableColor;

public class Square extends Rectangle implements  ColorAble{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
