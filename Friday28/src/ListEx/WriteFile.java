package ListEx;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            FileWriter fileWriter=new FileWriter("my.txt");
            fileWriter.write("This is the text");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

