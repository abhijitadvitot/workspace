//Java program to find given string is palindrome or not

package ReadInputMethods;

import java.util.Scanner;

public class Demo2 {
    public static void main(String [ ] args)
    {
        Scanner s=new Scanner(System.in);
        String str= new String();
        System.out.println("Enter a string");
        str = s.nextLine();
        StringBuffer stb = new StringBuffer(str);
        stb.reverse();
        if(stb.toString().equals(str))
            System.out.println("given String is Palindrome");
        else
            System.out.println("given string is not Palindrome");
    }
}

