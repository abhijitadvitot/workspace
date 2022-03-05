// compute the sum of the squares of integers 1-5
/*  // the stream operations are as follows:

        IntStream.range(1, 6) -> [1, 2, 3, 4, 5];
        .map -> [1, 4, 9, 16, 25]
        .sum -> 55
    }
}*/
package FunctionPgmEx;

import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 6)
                .map(n -> n * n)
                .sum();
        System.out.println(sum);

    }
}
