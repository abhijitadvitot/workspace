//Java Program demo for Extends Thread Multithreading

package MultiThreadExa;

public class Threaddemo  extends Thread
{
    int i=0;
    public void run()
    {
        for(;i<10;i++)
        {
            try
            {
                sleep(5000);
            }
            catch(Exception e) {
                System.out.println("Error in Thread"+e);
            }
            System.out.println ("Separate Thread:"+i);
        }
    }
}
