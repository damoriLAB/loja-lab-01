package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import database.OrderRepository;
import dto.CalculateOrdersTotalByDateRangeRequest;
import usecases.CalculateOrderRevenueByDateRange;
import util.DateUtil;
import util.PriceUtil;
import util.ShowResult;

public class CalculateOrderRevenueByDateRangeTest implements Test{
    private final OrderRepository orderRepository;
    private final DateTimeFormatter formatter = DateUtil.getFormatter();

    public CalculateOrderRevenueByDateRangeTest(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void test(){
        test1();
    }

    private void test1 (){
        LocalDate startDate = LocalDate.parse("01/02/2026", formatter);
        LocalDate endDate = LocalDate.parse("02/02/2026", formatter);
        CalculateOrdersTotalByDateRangeRequest req = new CalculateOrdersTotalByDateRangeRequest(startDate.atStartOfDay(), endDate.atStartOfDay().plusDays(1));
        Double result = new CalculateOrderRevenueByDateRange(orderRepository).execute(req);
        ShowResult.console("Faturamente entre " + DateUtil.format(startDate) + " e "+ DateUtil.format(endDate), PriceUtil.toString(result));
    }

    @Override
    public String getTestName() {
        return "CalculateOrderRevenueByDateRangeTest";
    }
}
