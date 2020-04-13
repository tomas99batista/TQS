package tqs.tomas.ua.StocksPortfolio;

import java.util.ArrayList;

public class StocksPortfolio{
    private String name = "STOCKS_PORTFOLIO";
    private IStockMarket IStockMarket;
    private ArrayList<Stock> stockArrayList = new ArrayList<>();

    public StocksPortfolio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IStockMarket getMarketService() {
        return IStockMarket;
    }

    public void setMarketService(IStockMarket IStockMarket) {
        this.IStockMarket = IStockMarket;
    }

    public void addStock(Stock stock){
        stockArrayList.add(stock);
    }

    public Double getTotalValue(){
        Double totalValue = 0.0;
        for(Stock stock: stockArrayList){
            totalValue += IStockMarket.getPrice(stock.getName()) * stock.getQuantity();
        }
        return totalValue;
    }
}
