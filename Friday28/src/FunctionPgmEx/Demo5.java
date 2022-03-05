package FunctionPgmEx;

import java.util.Arrays;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // the stream operations are as follows:
//        IntStream.of ->[3, 1, 4, 1, 5, 9, 2, 6, 5, 3]
//            -> filter-> [3, 1, 1, 5, 9, 5, 3]
//               -> map -> [9, 1, 1, 25, 81, 25, 9]
//               -> sum -> 151
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        Integer sum = integers.stream()
//          .reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//
//        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
//        Integer summation = integers.stream()
//          .reduce(0, Integer::sum);
//        System.out.println(summation);

        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum1 = integers2.stream()
                .reduce(0, Demo5::add);
    }
    public static int add(int a, int b) {
        return a + b;
    }

}

