package usecases;

import java.time.LocalDateTime;
import java.util.List;

import database.OrderRepository;
import dto.CalculateOrdersTotalByDateRangeRequest;
import models.Order;

public class CalculateOrderRevenueByDateRange {
    private final OrderRepository orderRepository;

    public CalculateOrderRevenueByDateRange(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public double execute(CalculateOrdersTotalByDateRangeRequest request) {
        List<Order> orders = orderRepository.getall();

        LocalDateTime sd = request.startDate();
        LocalDateTime ed = request.endDate();

        return orders.stream()
        .filter(o -> o.getCreatedAt().isAfter(sd) && o.getCreatedAt().isBefore(ed))
        .mapToDouble(Order::getTotal)
        .sum();
    }
}
