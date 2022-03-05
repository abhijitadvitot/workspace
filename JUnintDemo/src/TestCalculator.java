import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
public class TestCalculator {
    @Test(timeout = 2)
    public void additonTest()
    {
         int x=30;
         int y=50;
         int result=80;
         Calculator c= new Calculator();
          int finalresult=c.addition(x,y);
        Assert.assertEquals(result,finalresult);
    }
    @Test
    public void divTest()
    {
        int x=40;
        int y=20;
        int result=2;
        Calculator c= new Calculator();
        int finalresult=c.division(x,y);
        Assert.assertEquals(result,finalresult);

    }
    @Test
    public void subtractTest()
    {
        int x=30;
        int y=50;
        int result=-20;
        Calculator c= new Calculator();
        int finalresult=c.subtraction(x,y);
        Assert.assertEquals(result,finalresult);
    }
    @Test
    public void multiplicationTest()
    {
        int x=30;
        int y=50;
        int result=1500;
        Calculator c= new Calculator();
        int finalresult=c.multipilication(x,y);
        Assert.assertEquals(result,finalresult);
    }
@Test
    public void addiTest()
    {
        int x=30;
        int y=50;
  //      int result;
        Calculator c= new Calculator();
        int result=c.addition(x,y);
        System.out.println(result);
        //        Assert.assertEquals(result,finalresult);
    }
@Test
    public void great()
    {
       MaxMin.greates(10,50,30);
    }

    @Test(expected = AssertionError.class)
    public void testModulo(){
        int x=30;   // requirement collection
        int y=20;
        int result=600;
        Calculator calculator = new Calculator();
        int finalResult=calculator.modulo(x,y);
        Assert.assertEquals(result, finalResult);
    }

    @Test
    @Ignore
    public void testCaseNotYetImplimented(){

    }
}



