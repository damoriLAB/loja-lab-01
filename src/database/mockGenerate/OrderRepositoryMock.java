package database.mockGenerate;

import java.util.List;

import database.OrderRepository;
import models.Order;
import models.Product;
import models.User;

public class OrderRepositoryMock implements OrderRepository{
    private List<Order> orders;

    public OrderRepositoryMock(List<User> users, List<Product> products, int quantity)  {
        orders = OrderMockFactory.generateOrders(users, products, quantity);
    }

    @Override
    public List<Order> getall() {
        return orders;
    }

}
