import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesAmountTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSaleTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSale = 180 / 12;
        long actualAverageSale = service.averageSale(sales);
        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void maxSaleMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSaleMonth = 8;
        long actualMaxSaleMonth = service.maxSaleMonth(sales);
        Assertions.assertEquals(expectedMaxSaleMonth, actualMaxSaleMonth);
    }

    @Test
    public void minSaleMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSaleMonth = 9;
        long actualMinSaleMonth = service.minSaleMonth(sales);
        Assertions.assertEquals(expectedMinSaleMonth, actualMinSaleMonth);
    }

    @Test
    public void belowAverageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthBelowAverage = 5;
        long actualMonthBelowAverage = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedMonthBelowAverage, actualMonthBelowAverage);
    }

    @Test
    public void aboveAverageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthAboveAverage = 5;
        long actualMonthAboveAverage = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedMonthAboveAverage, actualMonthAboveAverage);
    }
}