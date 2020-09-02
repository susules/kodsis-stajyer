package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SalesDao {

    public SalesDao() {
    }

    public boolean salesEkle (Sales sales) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlSales = "INSERT INTO stajyer.sales " +
                    "(id, order_id, product_sale_date, payment_method)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?, ?, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlSales);
            preparedStatement.setInt(1, sales.getOrderId());
            preparedStatement.setDate(2, (java.sql.Date) sales.getProductSaleDate());
            preparedStatement.setString(3, sales.getPaymentMethod());
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