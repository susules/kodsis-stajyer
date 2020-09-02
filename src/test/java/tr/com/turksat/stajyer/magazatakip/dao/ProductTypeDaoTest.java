package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.ProductType;
import java.sql.Connection;

public class ProductTypeDaoTest {
    @Test
    public void testProductTypeEkle() {
        ProductType productType = new ProductType();
        productType.setProductTypeName("Phone");
        boolean eklendi = new ProductTypeDao().productTypeEkle(productType);
        Assert.assertTrue(eklendi);
    }
}