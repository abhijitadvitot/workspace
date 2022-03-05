package MultiThreadExa;

public class demo {
    public static void main(String[ ] args)
{    Thread obj=Thread.currentThread();
    System.out.println ("Current="+obj);
    obj.setName ("MERABHARATH");
    obj.setPriority(7);
    System.out.println ("After="+obj);
}
}
