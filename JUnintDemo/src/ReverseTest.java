import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class ReverseTest {

    @Test
     public void testReverseNumber() {

          int number=12345;
         int result= 0;
        Reverse r = new Reverse();
        int Finalresult = r.reverseNumber(result);
        Assert.assertEquals(result,Finalresult);

    }
}
