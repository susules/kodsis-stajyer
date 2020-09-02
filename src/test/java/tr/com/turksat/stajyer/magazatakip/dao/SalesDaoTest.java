package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.Sales;
import java.sql.Connection;

public class SalesDaoTest {
    @Test
    public void testSalesEkle (){
        Sales sales = new Sales();
        sales.setOrderId(sales.getOrderId());
        sales.setProductSaleDate(sales.getProductSaleDate());
        sales.setPaymentMethod("Cash");
        boolean eklendi =new SalesDao().salesEkle(sales);
        Assert.assertTrue(eklendi);
    }
}