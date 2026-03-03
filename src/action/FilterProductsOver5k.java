package action;

import java.util.List;

import database.ProductRepository;
import models.Product;

public class FilterProductsOver5k {
    private final ProductRepository productRepository;

    public FilterProductsOver5k(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> execute(){

        List<Product> products = productRepository.getall();
        return products.stream().filter(product -> product.getPrice() >= 5000).toList();
    }
}
