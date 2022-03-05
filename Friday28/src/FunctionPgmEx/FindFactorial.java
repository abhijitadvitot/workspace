package FunctionPgmEx;

import java.util.stream.IntStream;

public class FindFactorial {
    // Returns n!, or 1*2*3*...*(n-1)*n.
    // Assumes n is non-negative.
    public static int factorial(int n) {
        return IntStream.range(2, n + 1)
                .reduce(1, (a, b) -> a * b);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FindFactorial factorial=new FindFactorial();
        int fact=factorial.factorial(5);
        System.out.println(fact);
    }

}

