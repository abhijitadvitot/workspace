//Java program calculate the area of rectangle and triangle using Multi Level Inheritance

package Interfaces;

public class InterfaceArea {
    public static void main(String args[ ])
{    Rectangle rect = new Rectangle();
    Triangle tri = new Triangle();
    Area area;
    area = rect;
    System.out.println ("Area Of Rectangle = "+ area.compute(1,2));
    area = tri;
    System.out.println ("Area Of Triangle = "+ area.compute(10,2));
}
}

