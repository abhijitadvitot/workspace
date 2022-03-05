import java.util.Scanner;

public class FibonacciSerires {


    public  void fib()
    {
        int num,num1=0,num2=1,result;

        System.out.println("Fibonancci Serires");

        System.out.print(num1+" "+num2);

for(int i=2;i<10;i++)
{
    result=num1+num2;
    System.out.print(" "+result);
    num1=num2;
    num2=result;

        }
    }
}
