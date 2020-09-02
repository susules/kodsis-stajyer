package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDao {

    public OrderDao() {
    }

    public boolean orderEkle (Order order) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlOrder = "INSERT INTO stajyer.order " +
                    "(id, customer_account_id, product_id)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlOrder);
            preparedStatement.setInt(1, order.getCustomerAccountId());
            preparedStatement.setInt(2, order.getProductId());
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