// compute sum of absolute values of even ints

        package ListEx;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {


        ArrayList<Integer> list =
                new ArrayList<Integer>();
        list.add(-42);
        list.add(-17);
        list.add(68);
        list.stream()
                .map(Math::abs)
                .forEach(System.out::println);
    }
}
