package test;

import database.ProductRepository;
import usecases.GetTop10MostExpensiveProducts;
import util.ShowResult;

public class GetTop10MostExpensiveProductsTest implements Test{
    private final ProductRepository productRepository;

    
    public GetTop10MostExpensiveProductsTest(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void test() {
        test1();
    }

    private void test1(){
        GetTop10MostExpensiveProducts getTop10Products = new GetTop10MostExpensiveProducts(productRepository);
        ShowResult.console("Mostra top 10 produtos mais caros", getTop10Products.execute());
    }


    @Override
    public String getTestName() {
        return "GetTop10MostExpensiveProductsTest";
    }



}
