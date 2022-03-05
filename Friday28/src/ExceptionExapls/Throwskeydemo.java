package ExceptionExapls;

public class Throwskeydemo
{    public static void main(String args[])
    {    try
    {    ThrowsKEy td = new ThrowsKEy();
    }
    catch(NullPointerException e)
    {    System.out.println("recaught");
    }
    }
    }

