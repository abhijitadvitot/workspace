package AbstractEx;

public class TestMain  {
    public static void main(String args[ ])
{    Rodent r[ ]=new Rodent[3];
    r[0]=new Mouse();
    r[1]=new Gerbil();
    r[2]=new Hmaster();
    r[0].eat();
    r[1].eat();
    r[2].eat();
}
}
