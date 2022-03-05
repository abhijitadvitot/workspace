package MokitoExamples;

import org.junit.Before;

public class Demo {
     MyPortfolio myPortfolio;
    private Object myStockMarketMock;

    @Before
   public void setUpClass() {

    myPortfolio = new MyPortfolio();

    myPortfolio.setStockName("UniHut Portfolio");

    myStockMarketMock = EasyMock.createMock(MyStockMarket.class);

    myPortfolio.setMyStockMarket(myStockMarketMock);

}
}
