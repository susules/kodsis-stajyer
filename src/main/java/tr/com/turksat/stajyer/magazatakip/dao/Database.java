package tr.com.turksat.stajyer.magazatakip.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by scinkir on 25.06.2015.
 */
public class Database {

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stajyer",
                    "stajyer", "1");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() HATASI" + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
