package StringExamples;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String s1 = new String();
        System.out.println("Entr the First String");
        s1 = sc.nextLine();
        System.out.println(" " + s1);
        System.out.println("Length" + s1.length());

        String s2= new String();
        System.out.println("Entr the  Second String");
        s2 = sc.nextLine();
        System.out.println("Length" + s2.length());

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(1,5));
        System.out.println(s1.concat(s2));

        System.out.println(s1.replace('A','a'));

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println( s1.trim());
        System.out.println(s1.replace('A','B')   );

    }
}