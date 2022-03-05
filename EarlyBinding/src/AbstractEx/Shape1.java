package AbstractEx;

abstract class Shape1
{    public String color;
    public Shape1() {  }
    public void setColor(String c) { color = c; }
    public String getColor()
    {    return color;
    }
    abstract public double area();
}
