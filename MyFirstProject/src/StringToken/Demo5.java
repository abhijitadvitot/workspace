//Java program to find words in a given text.

package StringToken;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo5 {
    public static void main(String [ ] args)
    {
        Scanner s = new Scanner(System.in);
        String str = new String();
        int count=0;
        System.out.println("Enter a string");
        str = s.nextLine();
        StringTokenizer stzer = new StringTokenizer(str);
        while(stzer.hasMoreTokens())
        {
            System.out.println("Integer:"+stzer.nextToken());
            count+=Integer.parseInt(stzer.nextToken());
        }
        System.out.println("Total :"+count);
    }
}

