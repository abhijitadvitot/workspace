package ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {


    List l=new ArrayList();

        System.out.println("Enter the List");
        l.add("One");
        l.add("Tow");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        Iterator a= l.iterator();
      while(a.hasNext()){
          System.out.println(a.next());
      }
        for(Object ob:l)
    {
        System.out.println(ob);
    }
      for(int i=0;i<l.size();i++)
    {
        System.out.println(l.get(i));
    }

      l.remove(2);
      l.remove("Four");
        System.out.println(l);

    }
}
