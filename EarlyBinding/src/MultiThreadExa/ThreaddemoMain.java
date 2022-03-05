package MultiThreadExa;

public class ThreaddemoMain{
    public static void main(String a[ ])
    {
        Threaddemo td=new Threaddemo();
        td.start();
        for(int j=0;j<10;j++)
        {
            try
            {
                td.sleep(5000);
            }
            catch(Exception e) {
                System.out.println("Error "+e);
            }
            System.out.println("Main Thread:"+j);
        }
    }
}
