package PS6;

import java.util.*;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AMZ", 350, 10));
        stockList.add(new Stock("GOOGL", 500, 5));
        stockList.add(new Stock("AAPL", 200, 15));

        // 1. Print all stocks using forEach and Method Reference
        stockList.forEach(System.out::println);
        System.out.println("");
        // 2. Print stocks with symbol "AMZ"
        List<Stock> amzStocks = StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ"));
        System.out.println("Stocks with symbol AMZ:");
        amzStocks.forEach(System.out::println);
        System.out.println("");

        // 3. Print stocks with price above 300
        List<Stock> highPriceStocks = StockFilters.filter(stockList, stock -> stock.getPrice() > 300);
        System.out.println("Stocks with price above 300:");
        highPriceStocks.forEach(System.out::println);

	}

}
