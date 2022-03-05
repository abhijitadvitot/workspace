// compute the sum of squares of odd integers
/*// the stream operations are as follows:
IntStream.of  -> [3, 1, 4, 1, 5, 9, 2, 6, 5, 3]
    -> filter -> [3, 1, 1, 5, 9, 5, 3]
       -> map -> [9, 1, 1, 25, 81, 25, 9]
       -> sum -> 151*/

package FunctionPgmEx;

import java.util.stream.IntStream;

public class Demo1 {
    public static void main(String[] args) {
        // the stream operations are as follows:


        int sum =
                IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
                        .filter(n -> n % 2 != 0)
                        .map(n -> n * n)
                        .sum();

        System.out.println(sum);
      //  System.out.println(avg);
    }
}
