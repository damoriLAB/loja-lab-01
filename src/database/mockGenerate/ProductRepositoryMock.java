package database.mockGenerate;

import java.util.List;

import database.ProductRepository;
import models.Product;

public class ProductRepositoryMock implements ProductRepository{

    private List<Product> products;

    public ProductRepositoryMock(){
        products = ProductMockFactory.generate100Products();
    }

    @Override
    public List<Product> getall() {
         return products;
    }
    
}
