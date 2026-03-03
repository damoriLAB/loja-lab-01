package test;

import java.util.List;

import action.FilterProductsOver5k;
import database.ProductRepository;
import models.Product;
import util.Perfomance;
import util.ShowResult;

public class FilterProductsOver5kTest implements Test{
        private final ProductRepository productRepository;
        private final FilterProductsOver5k filterWithRepo; 

    public FilterProductsOver5kTest(ProductRepository productRepository) {
        this.productRepository = productRepository;
        filterWithRepo = new FilterProductsOver5k(productRepository);
    }

    @Override
    public void test(){
        Perfomance.mensureTimeExecution(() -> testSemConsole(filterWithRepo), 10);
    }

    private void test1(){
        FilterProductsOver5k filter5k = new FilterProductsOver5k(productRepository);
        ShowResult.console("Produtos acima de 5 mil", filter5k.execute());
    }

    private List<Product> testSemConsole(FilterProductsOver5k filter){
        return filter.execute();
    }

    @Override
    public String getTestName() {
        return "FilterProductsOver5kTest";
    }

}
