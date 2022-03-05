
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Demo {

    @Test(timeout=10)
     public void testGetPrime() {
        int number = 13;

    ExaplesDemo instance = new ExaplesDemo();

    int expResult = 0;

    int result = instance.getPrime(0);

    assertEquals(expResult, result);


    }



    @Ignore("Not ready yet")
    @Test
    public void testFactorial() {



        Demo instance = new Demo();

        instance.testFactorial();



    }



    @Ignore("To be completed later")
    @Test
    public void testReverseNumber() {



        Demo instance = new Demo();

        instance.testReverseNumber();

    }
}
