package database;
import models.Order;
import java.util.List;

public interface OrderRepository {
    List<Order> getall();
}
