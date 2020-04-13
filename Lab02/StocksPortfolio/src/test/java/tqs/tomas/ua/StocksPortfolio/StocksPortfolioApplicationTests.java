package tqs.tomas.ua.StocksPortfolio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class StocksPortfolioApplicationTests {

    @Mock
    IStockMarket iStockMarket;

    @InjectMocks
    StocksPortfolio stocksPortfolio = new StocksPortfolio();

    @BeforeEach
    void beforeEach(){
        System.out.println("---TESTS---");
        iStockMarket = Mockito.mock(IStockMarket.class);
        stocksPortfolio.setMarketService(iStockMarket);
    }

    @Test
    public void getPriceTest(){
        stocksPortfolio.addStock(new Stock("apple", 3));
        stocksPortfolio.addStock(new Stock("google", 5));

        Mockito.when(iStockMarket.getPrice("apple")).thenReturn(50.0);
        Mockito.when(iStockMarket.getPrice("google")).thenReturn(100.0);

        double marketValue = 50.0 * 3 + 100.0 * 5;
        assertEquals(marketValue, stocksPortfolio.getTotalValue());
    }
}
