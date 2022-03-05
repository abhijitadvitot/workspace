package ExceptionExapls;

public class demomain
{    public static void main(String ar[ ])
{    int a,b;
    a=10; b=0;
    try
    {    if(b==0)
        throw new Demo();
    else
        System.out.println("Q"+a/b);
    }
    catch(Exception e)
    {
    }
}
}