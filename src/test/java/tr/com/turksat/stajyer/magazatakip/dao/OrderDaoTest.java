package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.Order;
import java.sql.Connection;

public class OrderDaoTest {
    @Test
    public void testOrderEkle() {
        Order order = new Order();
        order.setCustomerAccountId(order.getCustomerAccountId());
        order.setProductId(order.getProductId());
        boolean eklendi =new OrderDao().orderEkle(order);
        Assert.assertTrue(eklendi);
    }
}