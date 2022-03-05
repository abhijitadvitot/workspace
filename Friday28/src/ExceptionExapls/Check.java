package ExceptionExapls;

public class Check {
    public static void main(String args[])
    {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

