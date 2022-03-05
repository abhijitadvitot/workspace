package ThisKey;

public class CountMain  extends Count
{
    public static void main(String[ ] args)
    {
        Count x = new Count();
        x.increment().increment().increment().print();
    }
}

