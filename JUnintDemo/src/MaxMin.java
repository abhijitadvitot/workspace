import org.junit.Test;

public class MaxMin {

    public static int greates(int a,int b,int c)
    {
           if(a>b && a>c)
           {
               System.out.println(a);
               return a;

           }
          if(b>a && b>c){
              System.out.println(b);
               return b;

          }
     else {
              System.out.println(c);
              return c;
          }
          }
}
