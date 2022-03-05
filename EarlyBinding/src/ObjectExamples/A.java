package ObjectExamples;

import java.util.Scanner;

public class A
{    int x,y;
    public void readdata()
    {    Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
    }
  public  void printdata()
    {    System.out.println("x="+x+"\n"+"y="+y);
    }
}
