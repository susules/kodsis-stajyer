package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDao {
    public ProductDao() {
    }
    public boolean productEkle (Product product) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con =Database.getInstance().getConnection();
            String insertSqlProduct = "INSERT INTO stajyer.product " +
                    "(id, product_description_id, product_price, number_of_products)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?, ?, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlProduct);
            preparedStatement.setInt(1, product.getProductDescriptionId());
            preparedStatement.setInt(2, product.getProductPrice());
            preparedStatement.setInt(3, product.getNumberOfProducts());
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