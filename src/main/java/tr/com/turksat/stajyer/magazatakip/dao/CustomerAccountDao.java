package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.CustomerAccount;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerAccountDao {

    public CustomerAccountDao() {
    }

    public boolean customerAccountEkle (CustomerAccount customerAccount) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlCustomerAccount = "INSERT INTO stajyer.customer_account " +
                    "(id, customer_id)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlCustomerAccount);
            preparedStatement.setInt(1, customerAccount.getCustomerId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            System.out.println("hatalı giriş"+ex);
            return false;
        } finally {
            Database.close(con);
        }
        return true;
    }
}