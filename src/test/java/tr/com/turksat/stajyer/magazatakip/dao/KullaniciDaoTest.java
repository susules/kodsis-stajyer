package tr.com.turksat.stajyer.magazatakip.dao;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by scinkir on 19.07.2017.
 */
public class KullaniciDaoTest {

    @Test
    public void testGetKullanici(){
        Connection con = Database.getConnection();
        Assert.assertEquals(1,1);
    }
}
