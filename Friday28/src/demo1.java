import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class demo1 {
    public static void main(String[] args) throws IOException {

    try (Stream st = lines(Paths.get("my.txt"))) {
    st.forEach(System.out::println);
}
}}

