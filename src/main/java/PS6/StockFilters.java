package PS6;

import java.util.*;
import java.util.function.Predicate;

public class StockFilters {

	public static List<Stock> filter(List<Stock> stocks, Predicate<Stock> predicate) {
        List<Stock> filteredStocks = new ArrayList<>();
        for (Stock stock : stocks) {
            if (predicate.test(stock)) {
                filteredStocks.add(stock);
            }
        }
        return filteredStocks;
    }
}
