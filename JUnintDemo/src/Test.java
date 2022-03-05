import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FacotrialTest.class,ReverseTest.class,Demo.class,SquarerootEx.class,TestCalculator.class})

public class Test {
    int x=0;
    int y=0;
    int result=0;
    Calculator calculator =null;

    @Before
    public void setup() {
        x = 30;
        y = 20;
        result = 50;
        calculator = new Calculator();
    }

    @org.junit.Test
    public void addtionTest(){
        result=50;
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
        System.out.println(result);
    }
    @org.junit.Test
    public void subtractionTest(){
        x=30;
        y=20;
        result=10;
        int finalResult=calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
        System.out.println(result);
    }
    @After
    public void cleaning(){
        x=0;
        y=0;
        calculator =null;
    }
    @AfterClass
    public static void setupAfterClassLevel(){
        System.out.println("Invoke After class loading class in JVM");
    }
    @BeforeClass
    public static void setupBeforeClassLevel(){
        System.out.println("Invoke Before class loading class in JVM");
    }
}
