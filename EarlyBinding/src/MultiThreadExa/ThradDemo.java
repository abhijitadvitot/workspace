// Implementing Runnable interface

package MultiThreadExa;

public class ThradDemo  implements Runnable
    {
        int x;  String name;
        public ThradDemo(String n)
        {
            name=n;
        }
        public void run()
        {
            for(x=0;x<10;x++)
            {
                System.out.println(name);
            }
        }
    }
