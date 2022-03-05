package AccessSpecifierDemo;

class demo{
    int x;    //default : whose accessibility is through out the package
    private int y;    //as y is private it can not be seen out side the class
    public int z;    //whose visibility will be through out the program
    protected int p;    //whose visibility is to the derived classes of other packages

    public static void main(String[] args) {

        demo d=new demo();
        d.x=10;
        d.y=20;
        d.z=30;
        d.p=40;
        System.out.println("  "+d.x+"    "+d.z+"   "+d.p+" "+d.y);
    }

}