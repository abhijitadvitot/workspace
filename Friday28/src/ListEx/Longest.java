// find longest line in the file
package ListEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Longest {
    public static void main(String[] args) throws IOException {


        int longest = Files.lines(Paths.get("my.txt"))
                .mapToInt(String::length)
                .max()
                .getAsInt();
        System.out.println(longest);
    }
}
