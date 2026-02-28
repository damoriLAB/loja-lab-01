package usecases;

import java.util.List;

import database.ProductRepository;
import models.Product;

public class GetTop10MostExpensiveProducts {
    private final ProductRepository productRepository;

    

    public GetTop10MostExpensiveProducts(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public List<Product> execute(){
        List<Product> products = productRepository.getall();

        return products.stream()
        .sorted((p1, p2) -> Float.compare(p2.getPrice(), p1.getPrice()))
        .limit(10)
        .toList();
    }
    
}
