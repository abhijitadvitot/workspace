package Examples;

public class RectangleMain {
    public static void main(String args[ ])
{    float area;
    Rectangle r = new Rectangle();
    r.getdata(5,5);
    area = r.length * r.breadth;
    System.out.println("Area : "+area);
}

}
