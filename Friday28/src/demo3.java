import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        Pattern patt = Pattern.compile(",");
        patt.splitAsStream("a,b,c")
                .forEach(System.out::println);
    }
}
