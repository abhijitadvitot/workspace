//Swapping using input

import java.util.Scanner;

public class SwapInput {

    int x;
    int y;
    Scanner sc = new Scanner(System.in);

    public void WOT() {
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of y");

        y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("" + x + " " + y);
    }

    public void thirdVar() {
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of y");
     y= sc.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("" + x + " " + y);

    }

    public static void main(String[] args) {
SwapInput s= new SwapInput();
s.WOT();
s.thirdVar();

    }
}
