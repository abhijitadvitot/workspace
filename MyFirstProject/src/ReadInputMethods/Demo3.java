//Java program to find frequency occurred in a text.

package ReadInputMethods;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo3 {
    public static void main(String [ ] args)
{    Scanner s = new Scanner(System.in);
    int count=0;
    String temp = new String();
    String str = new String();
    String sstr = new String();
    System.out.println("Enter a string");
    str = s.nextLine();
    System.out.println("Enter the string to be searched");
    sstr  = s.nextLine();
    StringTokenizer stzer = new StringTokenizer(str);
    while(stzer.hasMoreTokens())
    {    if(sstr.compareTo(stzer.nextToken())==0)
        count++;
    }
    System.out.println("Total Matches:"+count);
}
}

