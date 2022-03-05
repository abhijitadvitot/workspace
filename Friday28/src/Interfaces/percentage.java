package Interfaces;

public class percentage extends Test implements sports    //derived class
{    float avg,sum;
    void percal(int a,int b,int c)
    {    readdata(a,b,c);
        sum=(super.s1+super.s2+super.s3);  avg=sum/3;
    }
  public   void printdata()
    {    System.out.println("Subject s1 Marks="+s1);  System.out.println("Subject s2 Marks="+s2);
        System.out.println("Subject s3 Marks="+s3);  System.out.println("Subject sum="+sum);
        System.out.println("Subject average="+avg);
    }
}


