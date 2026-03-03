package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import action.GetOrdersByDateRange;
import database.OrderRepository;
import models.Order;
import util.DateUtil;
import util.ShowResult;

public class GetOrdersByDateRangeTest implements Test{
    private final OrderRepository orderRepository;
    private final DateTimeFormatter formatter = DateUtil.getFormatter();

    public GetOrdersByDateRangeTest(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void test(){
        test1();
    }

    private void test1(){
        LocalDate startDate = LocalDate.parse("01/02/2026", formatter);
        LocalDate endDate = LocalDate.parse("02/02/2026", formatter);
        List<Order> orders = new GetOrdersByDateRange(orderRepository).execute(startDate.atStartOfDay(), endDate.atStartOfDay().plusDays(1));
        ShowResult.console("Orders criada entre " + DateUtil.format(startDate) + " e "+ DateUtil.format(endDate) , orders);
    }

    @Override
    public String getTestName() {
        return "GetOrdersByDateRangeTest";
    }
    
}
