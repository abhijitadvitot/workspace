package MultiThreadExa;

public class ThrdDemoMain {
    public static void main (String args[ ])
    {
        ThradDemo tc1=new ThradDemo("welcome");
        ThradDemo tc2=new ThradDemo ("SVCE");
        Thread t1=new Thread(tc1);
        Thread t2=new Thread(tc2);
        t1.start();
        t2.start();
    }
}
