package Examples;

import java.util.stream.IntStream;

public class Dem {
    public static void main(String[] args) {


       // IntStream interface:
        IntStream.range(1, 11)
                .forEach(System.out::println);
    }
}