//Java Program demo for Multithreading

package MultiThreadExa;

public class ThreadDemo1 extends Thread
{    int i=0;
    public void run()
    {    for(;i<10;i++)
    {    System.out.println ("The value is :"+i);
    }
    }
}

