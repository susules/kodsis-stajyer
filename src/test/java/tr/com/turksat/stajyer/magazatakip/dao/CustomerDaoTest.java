package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;
import tr.com.turksat.stajyer.magazatakip.domain.Customer;
import java.sql.Connection;

public class CustomerDaoTest {
    @Test
    public void testCustomerEkle(){
        Customer customer= new Customer();
        customer.setCustomerName("d");
        customer.setCustomerSurname("d");
        customer.setAddress("d");
        customer.setAge(1);
        customer.setGender("Kadın");
        customer.setMail("Kadın");
        customer.setPhone("Kadın");
        boolean eklendi =new CustomerDao().customerEkle(customer);
        Assert.assertTrue(eklendi);
    }
}