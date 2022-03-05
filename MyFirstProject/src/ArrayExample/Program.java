//Java program to read 5 numbers and print sum using 1D

package ArrayExample;

public class Program {
    public static void main(String args[ ])
        {    int sum=0;
            int n[ ]=new int [101];
            for(int i=0;i<5;i++)
            {    n[i]=Integer.parseInt(args[i]);
                sum=sum+n[i];
            }
            System.out.println("Total="+sum);
        }
    }

