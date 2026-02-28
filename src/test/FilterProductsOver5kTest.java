package test;

import database.ProductRepository;
import usecases.FilterProductsOver5k;
import util.ShowResult;

public class FilterProductsOver5kTest implements Test{
        private final ProductRepository productRepository;

    public FilterProductsOver5kTest(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void test(){
        test1();
    }

    private void test1(){
        FilterProductsOver5k filter5k = new FilterProductsOver5k(productRepository);
        ShowResult.console("Produtos acima de 5 mil", filter5k.execute());
    }

    @Override
    public String getTestName() {
        return "FilterProductsOver5kTest";
    }

}
