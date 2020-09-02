package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.ProductDescription;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ProductDescriptionDao {
    public ProductDescriptionDao() {
    }

    public boolean productDescriptionEkle (ProductDescription productDescription) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlProductDescription = "INSERT INTO stajyer.product_description " +
                    "(id, product_type_id, product_manufacturing_date, product_brand, " +
                    "product_model, product_colour, product_warranty_period, product_weight)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?, ?, ?, ?, ?, ?, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlProductDescription);
            preparedStatement.setInt(1, productDescription.getProductTypeId());
            preparedStatement.setDate(2, productDescription.getProductManufacturingDate());
            preparedStatement.setString(3, productDescription.getProductBrand());
            preparedStatement.setString(4, productDescription.getProductModel());
            preparedStatement.setString(5, productDescription.getProductColour());
            preparedStatement.setInt(6, productDescription.getProductWarrantyPeriod());
            preparedStatement.setInt(7, productDescription.getProductWeight());
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