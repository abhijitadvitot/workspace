//Java program to sort n names using strings

package ReadInputMethods;

import javax.swing.*;

public class Demo5 {
       public static void main(String [] args)
    { int n=Integer.parseInt(JOptionPane.showInputDialog("Enter no. of cities"));
        int i=0,j=0;
        String str[]=new String[n];
        String s = new String();
        System.out.println("Enter cities:\n");
        for(i=0;i<n;i++)
        {    str[i] = new String();
            str[i] = JOptionPane.showInputDialog("enter a city");
        }
        for(i=0;i<n-1;i++)
        {    for(j=0;j<n-1;j++)
        {    if(str[j].compareTo(str[j+1])>0)
        {    s=str[j];
            str[j]=str[j+1];
            str[j+1]=s;
        }
        }
        } System.out.println("Sorted Cities");
        for(i=0;i<n;i++)
            System.out.println("  "+str[i]);
    }
    }

