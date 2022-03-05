//List Examples


package FunctionPgmEx;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {


    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    Integer sum = integers.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
}}

