package usecases;

import java.time.LocalDateTime;
import java.util.List;

import database.OrderRepository;
import models.Order;

public class GetOrdersByDateRange {
    private final OrderRepository orderRepository;

    public GetOrdersByDateRange(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    
    public List<Order> execute(LocalDateTime start, LocalDateTime end) {
        return orderRepository
        .getall()
        .stream()
        .filter(order -> order.getCreatedAt().isAfter(start) && order.getCreatedAt().isBefore(end))
        .toList();
    }
    
}
