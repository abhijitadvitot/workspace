//java program to find length of the given array.

package ArrayExample;

import java.util.Scanner;

public class ArrLegth {
    public static void main(String args[ ])
    {
        int[ ] a=new int[10];
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        n=s.nextInt();
        System.out.println("Enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("length:"+a.length);
    }
}

