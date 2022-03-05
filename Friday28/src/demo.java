import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("my.txt");
             BufferedReader br = new BufferedReader(fr)) {
            br.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
