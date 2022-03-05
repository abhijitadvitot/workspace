package ListExamples;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        String[] names = {"Ann", "Bob", "Carol"};// Add to arrayList
        for (int k = 0; k < names.length; k++) {
            nameList.add(names[k]);
        }// Display name list
            for (int i = 0; i < nameList.size(); i++) {
                System.out.println(nameList.get(i));
            }
        }

    }
