//Java program for StringTokenizer class.

package StringToken;

import java.util.StringTokenizer;

public class demo4 {
    public static void main(String [ ] args)
    {
        String s=new String("27/9/1990:4-4-727:a");
        StringTokenizer st=new StringTokenizer(s,"/:");
        System.out.println("TotalTokens:"+st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println("  "+st.nextToken());
        }
    }
}

