import java.util.ArrayList;
import java.util.List;

import bootstrap.TestBootstrap;
import database.OrderRepository;
import database.ProductRepository;
import database.UserRepository;
import database.mockGenerate.OrderRepositoryMock;
import database.mockGenerate.ProductRepositoryMock;
import database.mockGenerate.UserRepositoryMock;

import util.ShowResult;

public class App {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        

        System.out.println("======== AMBIENTE - LOJA - 26/02/2026 =========");
        

        UserRepository userRepository = new UserRepositoryMock(30);
        ProductRepository productRepository = new ProductRepositoryMock();
        OrderRepository orderRepository = new OrderRepositoryMock(
            userRepository.getall(),
             productRepository.getall(),
              32
        );

        new TestBootstrap(orderRepository, productRepository, userRepository).init();
        
        

        
      
    }
}

