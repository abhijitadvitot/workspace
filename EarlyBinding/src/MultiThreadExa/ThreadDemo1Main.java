package MultiThreadExa;

public class ThreadDemo1Main {
        public static void main(String a[ ])
    {    ThreadDemo1 td=new ThreadDemo1();
        Thread t=new Thread();
        td.start();
        for(int j=0;j<10;j++)
        {
            System.out.println ("The value in main: "+j);
        }
    }
    }
