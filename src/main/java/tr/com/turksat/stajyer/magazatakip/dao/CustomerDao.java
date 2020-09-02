package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDao {

    public CustomerDao() {
    }

    public boolean customerEkle(Customer customer) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getInstance().getConnection();
            String insertSqlCustomer = "INSERT INTO stajyer.customer " +
                    "(id, customer_name, customer_surname, customer_phone, customer_mail, " +
                    "customer_address, customer_gender, customer_age)\n" +
                    "VALUES \n" +
                    "(DEFAULT, ?, ?, ?, ?, ?, ?, ?);\n";
            PreparedStatement preparedStatement = con.prepareStatement(insertSqlCustomer);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerSurname());
            preparedStatement.setString(3, customer.getPhone());
            preparedStatement.setString(4, customer.getMail());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setString(6, customer.getGender());
            preparedStatement.setInt(7, customer.getAge());
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