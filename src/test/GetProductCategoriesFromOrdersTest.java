package test;

import java.util.ArrayList;
import java.util.List;

import action.GetProductCategoriesFromOrders;
import database.OrderRepository;
import models.Order;
import util.ShowResult;

public class GetProductCategoriesFromOrdersTest implements Test{
    private final OrderRepository orderRepository;

    public GetProductCategoriesFromOrdersTest(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void test() {
        test1();
    }

    private void test1(){

        List<Order> orders = new ArrayList<Order>();
        orders.add(orderRepository.getall().get(1));
        orders.add(orderRepository.getall().get(2));
        orders.add(orderRepository.getall().get(3));
        orders.add(orderRepository.getall().get(4));
        ShowResult.console("Orders Usadas", orders);
        ShowResult.console(getTestName(), new GetProductCategoriesFromOrders().execute(orders));

    }

    @Override
    public String getTestName() {
        return "GetProductCategoriesFromOrdersTest";
    }

    
}
