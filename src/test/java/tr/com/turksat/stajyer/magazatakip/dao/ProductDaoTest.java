package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.Product;
import java.sql.Connection;

public class ProductDaoTest {
    @Test
    public void testProductEkle() {
        Product product = new Product();
        product.setProductDescriptionId(product.getProductDescriptionId());
        product.setProductPrice(12500);
        product.setNumberOfProducts(5);
        boolean eklendi =new ProductDao().productEkle(product);
        Assert.assertTrue(eklendi);
    }
}