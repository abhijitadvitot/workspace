package ListExamples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List l=new ArrayList();

        System.out.println("Enter the List");
        l.add("One");
        l.add("Tow");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        for(Object ob:l)
        {
            System.out.println(ob);
        }
      for(int i=0;i<l.size();i++)
      {
          System.out.println(l.get(i));
      }
        System.out.println(l);
    }
}
