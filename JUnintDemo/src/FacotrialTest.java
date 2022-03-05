import org.junit.Assert;
import org.junit.Test;

public class FacotrialTest {

    @Test
    public void testFavotrial()
    {


         int n=5;
         int output=120;
          Factorial f= new Factorial();
          int finalresult=f.fact(n);
        Assert.assertEquals(output,finalresult);

    }
}
