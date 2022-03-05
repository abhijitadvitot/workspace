//java program to find sum of the array of n elements.
package ArrayExample;

import java.util.Scanner;

public class ArraySum {
    public static void main(String [ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array");
        int sum=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("sum of array elements is:"+sum);
    }
}

