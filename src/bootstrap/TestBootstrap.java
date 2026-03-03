package bootstrap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import database.OrderRepository;
import database.ProductRepository;
import database.UserRepository;
import test.CalculateOrderRevenueByDateRangeTest;
import test.FilterProductsOver5kTest;
import test.GetOrdersByDateRangeTest;
import test.Test;

public class TestBootstrap {

    private static Map<String,Test> tests = new HashMap<>();

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    


    public TestBootstrap(OrderRepository orderRepository, ProductRepository productRepository,
            UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }


    public void init(){
        loadTest();
        executeByName("FilterProductsOver5kTest");

        
    }

    private void loadTest(){
        tests.put("CalculateOrderRevenueByDateRangeTest", new CalculateOrderRevenueByDateRangeTest(orderRepository));
        tests.put("GetOrdersByDateRangeTest", new GetOrdersByDateRangeTest(orderRepository));
        tests.put("FilterProductsOver5kTest", new FilterProductsOver5kTest(productRepository));
    }

    private void executeByName(String ...names) {
        for(String name: names){
            Test test = tests.get(name);
            if(test != null) test.test();
        }
    }


}
