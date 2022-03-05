package AbstractEx;

public class ShapeMain
{    public static void main(String [ ]args)
{    Shape s;
    s = new Trapezoid();    s.numberOfSides();
    s = new Hexagon();       s.numberOfSides();
    s = new Triangle();    s.numberOfSides();
}
}
