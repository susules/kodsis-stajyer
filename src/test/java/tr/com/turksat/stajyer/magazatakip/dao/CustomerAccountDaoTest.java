package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.CustomerAccount;
import java.sql.Connection;

public class CustomerAccountDaoTest {
    @Test
    public void testCustomerAccountEkle(){
        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setCustomerId(customerAccount.getCustomerId());
        boolean eklendi =new CustomerAccountDao().customerAccountEkle(customerAccount);
        Assert.assertTrue(eklendi);
    }
}