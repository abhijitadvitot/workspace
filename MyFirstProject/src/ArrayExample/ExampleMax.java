package ArrayExample;

import java.util.Scanner;

public class ExampleMax {

    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the B matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();

            }

        }

        System.out.println("Enter the B matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    c[i][j] = 0;
                    c[i][j] =c[i][k]+ a[i][k] * b[i][k];
                }
                System.out.println("" + c[i][j]);
            }


        }
    }
}
