//1. Write a program that will compute the following series:
//        (a) 1/1 + 1/2 + 1/3 + ...... + 1/n.

        package Thurday27;

public class Demo1 {
    public static void main(String args[ ])
    {                int n=Integer.parseInt(args[0]);
        double sum=0.0;
        for(int i=1;i<=n;i++)
            sum=sum+(1.0/i);
        System.out.println("Sum is "+sum);
    }
    }