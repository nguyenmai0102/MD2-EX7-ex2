import rableColor.Rectangle;
import rableColor.Shape;
import rableColor.Square;
import  rableColor.Circle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        //Khoi tao doi tuong va add vao mang


        Square square = new Square("green" , true, 5);
        square.howtoColor();
        shapes[0] = square;


     Circle circle = new Circle("blue", true, 8);
     circle.howtoColor();
     shapes[1]= circle;

        Rectangle rectangle = new Rectangle("red",true,9,15);
        rectangle.howtoColor();
        shapes[2] = rectangle;
    }
}
