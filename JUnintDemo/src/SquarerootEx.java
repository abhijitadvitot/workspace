import org.junit.Assert;
import org.junit.Test;

public class SquarerootEx {


        public double findSquareroot(double num)                  {

        return Math.sqrt(num);

    }

    @Test
   public void testFindSquareroot() {

        SquarerootEx arithmetic = new SquarerootEx();

        double expResult = 2.5;

        double result =arithmetic.findSquareroot(6.25);
        Assert.assertEquals("findSquareroot",expResult, result, 0.0);

    }}
