package ExceptionExapls;

public class ThrowsKEy {
    public ThrowsKEy() throws NullPointerException
{    System.out.println("caught");
    throw new NullPointerException("demo");
}
}

