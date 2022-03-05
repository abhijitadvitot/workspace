//Extending thread class

package MultiThreadExa;

public class demo1  extends Thread
{
    public void run()
    {
        System.out.println ("Thread is running….");
    }
    public void start()
    {
        run();
    }
    public static void main(String args[ ])
    {
        demo1 t=new demo1();
        t.start();
    }
}

