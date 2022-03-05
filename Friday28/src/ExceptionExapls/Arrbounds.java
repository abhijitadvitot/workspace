package ExceptionExapls;

public class Arrbounds {
    public static void main(String args[])
{    int x[]=new int[10];
    try
    {    x[20]=100;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {    System.out.println("Exception cought");
    }

    finally
    {      System.out.println("Not Possible to print");
        System.out.println("quit");
    }
}
}

