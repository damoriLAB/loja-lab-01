package models;

import java.time.LocalDateTime;
import java.util.List;

import util.DateUtil;
import util.PriceUtil;

public class Order {

    private String id;
    private User user;
    private List<Product> products;
    private LocalDateTime createdAt;

    public Order(String id, User user, List<Product> products, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public User getUser() { return user; }
    public List<Product> getProducts() { return products; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public double getTotal() {
        double total = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        return PriceUtil.generate(total);
    }

    @Override
    public String toString() {

        String prodString = products.toString();
        

        return "Order{" + "\n" +
                "user= " + user + "\n" +
                "products : " + prodString + "\n" +
                ", total= " + PriceUtil.toString(getTotal()) + "\n" +
                ", date= " + DateUtil.format(createdAt) + "\n" +
                '}';
    }
}