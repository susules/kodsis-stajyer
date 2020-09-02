package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.ProductType;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductTypeDao {

    public ProductTypeDao() {
    }

    public boolean productTypeEkle(ProductType productType) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlProductType = "INSERT INTO stajyer.product_type " +
                    "(id, product_type_name)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlProductType);
            preparedStatement.setString(1, productType.getProductTypeName());
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