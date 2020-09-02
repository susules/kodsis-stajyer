package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.ProductDescription;
import java.sql.Connection;
import java.sql.Date;

public class ProductDescriptionDaoTest {
    @Test
    public void testProductDescriptionEkle(){
        ProductDescription productDescription = new ProductDescription();
        productDescription.setProductBrand("Apple");
        productDescription.setProductModel("IPhone X");
        productDescription.setProductColour("Gray");
        productDescription.setProductWarrantyPeriod(2);
        productDescription.setProductWeight(250);
        productDescription.setProductManufacturingDate(new Date(2019-12-12));
        boolean eklendi = new ProductDescriptionDao().productDescriptionEkle (productDescription);
        Assert.assertTrue(eklendi);
    }
}