//write a java program to perform bitwise operators
package Operators;

public class BitwiseOperator
{
    public BitwiseOperator( ) {
        int a = 11; //1 0 1 1
        int b = 12; //1 1 0 0
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));
        a = 2;
        b = 1;
        System.out.println("a << b : " + (a << b));
        System.out.println("a >> b : " + (a >> b));
        System.out.println("a >>> b : " + (a >>> b));
    }
    public static void main(String args[ ])
    {       BitwiseOperator obj = new BitwiseOperator();
    }
}
