package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import database.ProductRepository;
import models.Order;
import models.Product;
import models.ProductCategory;

public class GetProductCategoriesFromOrders {



    public Set<ProductCategory> execute (Order order){
        List<Product> products = order.getProducts();

        return products.stream()
        .map(p -> p.getCategory())
        .collect(Collectors.toSet());
    }

    public Set<ProductCategory> execute (List<Order> orders){
        return orders.stream().
            flatMap(o -> o.getProducts().stream())
            .map(Product::getCategory)
            .collect(Collectors.toSet());
    }
    
}
