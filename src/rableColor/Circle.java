package rableColor;

import com.sun.scenario.effect.impl.prism.PrImage;

public class Circle  extends  Shape implements ColorAble{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return  radius*radius*Math.PI;
    }
    public double getPerimetter(){
        return  2*radius* Math.PI;
    }


    @Override
    public void howtoColor() {
        System.out.println("Color circle");
    }
}
